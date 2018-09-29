package kr.cms.booking.controller;

import kr.cms.booking.domain.Booking;
import kr.cms.booking.repository.BookingRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/booking")
public class BookingFilterController {

    private BookingRepository bookingRepository;

    @GetMapping("/all")
    public List<Booking> getAllBooking() {
        List<Booking> bookingList = new ArrayList<>();

        bookingList.add(Booking.builder()
                .facilityId(11)
                .year(2018)
                .weekOfYear(1)
                .bookingDate(LocalDateTime.now())
                .bookingTimeId(11)
                .meetingTitleId(2)
                .userId(5899)
                .build());

        return bookingList;
    }

    /*
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
    */
}
