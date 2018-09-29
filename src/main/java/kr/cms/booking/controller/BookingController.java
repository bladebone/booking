package kr.cms.booking.controller;

import kr.cms.booking.repository.BookingRepository;
import kr.cms.booking.dto.BookingSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/booking")
public class BookingController {

    private BookingRepository bookingRepository;

    @PostMapping
    public Object saveBooking(@RequestBody BookingSaveRequestDto dto) {
        return bookingRepository.save(dto.toEntity());
    }

    @DeleteMapping
    public void deleteBooking() {
    }

    @PutMapping
    public void updateBooking() {
    }

}
