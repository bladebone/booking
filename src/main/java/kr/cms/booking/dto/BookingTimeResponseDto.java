package kr.cms.booking.dto;

import kr.cms.booking.domain.BookingTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookingTimeResponseDto {
    private long id;
    private String code;
    private int hour;
    private int minute;
    private boolean bookable;

    public BookingTimeResponseDto(BookingTime bookingTime) {
        this.id = bookingTime.getId();
        this.code = bookingTime.getCode();
        this.hour = bookingTime.getHour();
        this.minute = bookingTime.getMinute();
        this.bookable = bookingTime.isBookable();
    }
}
