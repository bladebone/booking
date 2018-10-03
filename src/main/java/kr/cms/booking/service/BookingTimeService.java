package kr.cms.booking.service;

import kr.cms.booking.dto.BookingTimeResponseDto;
import kr.cms.booking.repository.BookingTimeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BookingTimeService {
    private BookingTimeRepository bookingTimeRepository;

    @Transactional(readOnly = true)
    public List<BookingTimeResponseDto> findAll() {
        return bookingTimeRepository.findAll()
                .stream().map(BookingTimeResponseDto::new)
                .collect(Collectors.toList());
    }

    /*
    void enableTime(BookingTime bookingTime);

    void disableTime(BookingTime bookingTime);
    */
}
