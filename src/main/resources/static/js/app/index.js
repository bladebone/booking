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

            if (bookingTimeList) {
                // var am6Data = [];
                // var am12Data = [];
                // var pm18Data = [];
                // var pm24Data = [];
                var data = [];
                $.each(bookingTimeList[0], function() {
                    // this['title'] = this['code'].substring(this['code'].indexOf(':') + 1);
                    // if (this['hour'] < 6)
                    //     am6Data.push(this);
                    // else if (this['hour'] < 12)
                    //     am12Data.push(this);
                    // else if (this['hour'] < 18)
                    //     pm18Data.push(this);
                    // else
                    //     pm24Data.push(this);
                    if (this['bookable'])
                        data.push(this);
                });
                // timeData.am6List = am6Data;
                // timeData.am12List = am12Data;
                // timeData.pm18List = pm18Data;
                // timeData.pm24List = pm24Data;
                timeData.bookingTimeList = data;

                $('#timeDiv').html(timeTemplate(timeData));
            }

            if (dayOfWeekList)
                facilityData.dayOfWeekList = dayOfWeekList[0];

            if (siteList)
                facilityData.siteList = siteList[0];

            if (facilityList)
                facilityData.facilityList = facilityList[0];

            $('#facilityDiv').html(facilityTemplate(facilityData));

            readyFunc();

            $('#loadingModal').modal('toggle');
        });
    },

    eventHandling : function() {
        $('div.time').mousedown(function() {

            var limitLength = 4;
            var selectedLength = $('div.time.bg-success').length;

            if ($(this).hasClass('bg-success')) {
                $(this).removeClass('bg-success');
                $(this).find('input').val('N');
                $(this).nextAll().each(function () {
                    $(this).removeClass('bg-success');
                    $(this).find('input').val('N');
                });
            } else {
                if (selectedLength >= limitLength
                    || selectedLength === 0
                    || !$(this).prev().hasClass('bg-success') && !$(this).next().hasClass('bg-success')) {

                    $('div.time').each(function () {
                        $(this).removeClass('bg-success');
                        $(this).find('input').val('N');
                    });
                    $(this).addClass('bg-success');
                    $(this).find('input').val('Y');
                    var $targetObj = $(this);
                    for (var i = 0; i < 3; i++) {
                        $targetObj = $targetObj.next();
                        $targetObj.addClass('bg-success');
                        $targetObj.find('input').val('Y');
                    }
                } else {
                    $(this).addClass('bg-success');
                    $(this).find('input').val('Y');
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