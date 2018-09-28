package kr.cms.booking.domain;

import lombok.Data;

@Data
public class BookingTime {
    private int bookingDayOfWeek;
    private int bookingTimeId;

    public BookingTime() {}

    public BookingTime(int bookingDayOfWeek, int bookingTimeId) {
        this.bookingDayOfWeek = bookingDayOfWeek;
        this.bookingTimeId = bookingTimeId;
    }
}
