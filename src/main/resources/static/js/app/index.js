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
                var am6Data = [];
                var am12Data = [];
                var pm18Data = [];
                var pm24Data = [];
                $.each(bookingTimeList[0], function() {
                    this['title'] = this['code'].substring(this['code'].indexOf(':') + 1);
                    if (this['hour'] < 6)
                        am6Data.push(this);
                    else if (this['hour'] < 12)
                        am12Data.push(this);
                    else if (this['hour'] < 18)
                        pm18Data.push(this);
                    else
                        pm24Data.push(this);
                });
                timeData.am6List = am6Data;
                timeData.am12List = am12Data;
                timeData.pm18List = pm18Data;
                timeData.pm24List = pm24Data;

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
        $('td.time').mousedown(function() {
            if ($(this).hasClass('table-success')) {
                $(this).removeClass('table-success');
                $(this).find('input').val('N');
            } else {
                if ($('td.time.table-success').length < 4) {
                    $(this).addClass('table-success');
                    $(this).find('input').val('Y');
                }
            }
        }).mouseenter(function(e) {
            if (e.buttons === 1) {
                $(this).mousedown();
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