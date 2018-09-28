package kr.cms.booking.controller;

import kr.cms.booking.domain.Booking;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @PostMapping
    public void addBooking() {
    }

    @DeleteMapping
    public void deleteBooking() {
    }

    @PutMapping
    public void updateBooking() {
    }

}
