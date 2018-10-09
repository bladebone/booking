var index = {
    init: function() {

        var _this = this;

        $('#loadingModal').modal('toggle');

        _this.handlebarsInit(_this.eventHandling);
    },

    handlebarsInit: function(readyFunc) {

        var timeSource = $('#time-template').html();
        var timeTemplate = Handlebars.compile(timeSource);
        var timeData = {};

        var facilitySource = $('#facility-template').html();
        var facilityTemplate = Handlebars.compile(facilitySource);
        var facilityData = {};

        Handlebars.registerHelper('ifFirst', function(sequence, options) {
            if (sequence === 1)
                return options.fn(this);
            else
                return options.inverse(this);
        });

        Handlebars.registerHelper('getSiteTH', function(siteCode) {
            var th = '';
            $.each(facilityData.siteList, function() {
                if (siteCode === this['code'])
                    th = new Handlebars.SafeString('<th class="site ' + this['code'] + '" rowspan="' + this['facilityCount'] + '">' + this['title'] + '</th>');
            });
            return th;
        });

        $.when(
            $.getJSON('/bookingTimeList'),
            $.getJSON('/dayOfWeekList'),
            $.getJSON('/siteList'),
            $.getJSON('/facilityList')
        ).done(function(bookingTimeList, dayOfWeekList, siteList, facilityList) {

            if (bookingTimeList[1] === 'success') {
                var data = [];
                $.each(bookingTimeList[0], function() {
                    if (this.bookable)
                        data.push(this);
                });
                timeData.bookingTimeList = data;

                $('#timeDiv').html(timeTemplate(timeData));
            }

            if (dayOfWeekList[1] === 'success')
                facilityData.dayOfWeekList = dayOfWeekList[0];

            if (siteList[1] === 'success')
                facilityData.siteList = siteList[0];

            if (facilityList[1] === 'success')
                facilityData.facilityList = facilityList[0];

            $('#facilityDiv').html(facilityTemplate(facilityData));

            readyFunc();

            $('#loadingModal').modal('toggle');
        });
    },

    eventHandling : function() {

        $('div.time').mousedown(function() {

            var switchOn = function(object) {
                object.addClass('bg-success');
                object.find('input').val('Y');
            };

            var switchOff = function(object) {
                object.removeClass('bg-success');
                object.find('input').val('N');
            };

            var limitLength = 4;
            var selectedLength = $('div.time.bg-success').length;

            if ($(this).hasClass('bg-success')) {
                switchOff($(this));
                $(this).nextAll().each(function () {
                    switchOff($(this));
                });
            } else {
                if (selectedLength >= limitLength
                    || selectedLength === 0
                    || !$(this).prev().hasClass('bg-success') && !$(this).next().hasClass('bg-success')) {

                    $('div.time.bg-success').each(function () {
                        switchOff($(this));
                    });
                    var $targetObj = $(this);
                    for (var i = 0; i < limitLength; i++) {
                        switchOn($targetObj);
                        $targetObj = $targetObj.next();
                    }
                } else {
                    switchOn($(this));
                }
            }
        });

        $('th.facility').mousedown(function() {
            if ($(this).hasClass('table-success')) {
                $(this).removeClass('table-success');
                $(this).find('input').val('N');
            } else {
                $(this).addClass('table-success');
                $(this).find('input').val('Y');
            }
        }).mouseenter(function(e) {
            if (e.buttons === 1) {
                $(this).mousedown();
            }
        });

        $('th.site').mousedown(function() {
            var siteCode = $(this).attr('class').split(' ', 2)[1];
            if ($(this).hasClass('table-success')) {
                $(this).removeClass('table-success');
                $(this).find('input').val('N');
                $('th[class*=' + siteCode + ']').each(function() {
                    $(this).removeClass('table-success');
                    $(this).find('input').val('N');
                });
            } else {
                $(this).addClass('table-success');
                $(this).find('input').val('Y');
                $('th[class*=' + siteCode + ']').each(function() {
                    $(this).addClass('table-success');
                    $(this).find('input').val('Y');
                });
            }
        }).mouseenter(function(e) {
            if (e.buttons === 1) {
                $(this).mousedown();
            }
        });

        $('th.day').mousedown(function() {
            if ($(this).hasClass('table-success')) {
                $(this).removeClass('table-success');
                $(this).find('input').val('N');
            } else {
                $(this).addClass('table-success');
                $(this).find('input').val('Y');
            }
        }).mouseenter(function(e) {
            if (e.buttons === 1) {
                $(this).mousedown();
            }
        });
    }
};

index.init();