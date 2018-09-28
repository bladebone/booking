package kr.cms.booking.controller;

import kr.cms.booking.domain.Booking;
import org.springframework.boot.json.JsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingFilterController {

    @GetMapping("/all")
    public List<Booking> getAllBooking() {
        return new ArrayList<Booking>();
    }

    @GetMapping("/building/{buildingId}")
    public List<Booking> getBookingBuilding(@PathVariable String buildingId) {
        return new ArrayList<Booking>();
    }

    @GetMapping("/stair/{buildingId}/{stairId}")
    public List<Booking> getBookingStair(@PathVariable String buildingId, @PathVariable String stairId) {
        return new ArrayList<Booking>();
    }

    @GetMapping("/time/{startTime}/{endTime}")
    public List<Booking> getBookingTime(@PathVariable int startTime, @PathVariable int endTime) {
        return new ArrayList<Booking>();
    }
}
