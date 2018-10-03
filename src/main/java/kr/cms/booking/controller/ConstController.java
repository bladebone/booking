package kr.cms.booking.controller;

import kr.cms.booking.dto.BookingTimeResponseDto;
import kr.cms.booking.dto.FacilityResponseDto;
import kr.cms.booking.dto.SiteResponseDto;
import kr.cms.booking.service.BookingTimeService;
import kr.cms.booking.service.ConstService;
import kr.cms.booking.service.FacilityService;
import kr.cms.booking.service.SiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class ConstController {

    private ConstService constService;

    private SiteService siteService;

    private FacilityService facilityService;

    private BookingTimeService bookingTimeService;

    @GetMapping("/dayOfWeekList")
    public List<Map<String, Object>> getDayOfWeekList() {
        return constService.dayOfWeekList();
    }

    @GetMapping("/siteList")
    public List<SiteResponseDto> getSiteList() {
        return siteService.findAll();
    }

    @GetMapping("/facilityList")
    public List<FacilityResponseDto> getFacilityList() {
        return facilityService.findAll();
    }

    @GetMapping("/bookingTimeList")
    public List<BookingTimeResponseDto> getBookingTimeList() {
        return bookingTimeService.findAll();
    }
}
