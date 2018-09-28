package kr.cms.booking.domain;

import lombok.Data;

@Data
public class BookingReserved extends Booking {
    public BookingReserved() {}

    public BookingReserved(int year, int weekOfYear, Facility facility, BookingTime[] bookingTime, String meetingTitle, UserInfo userInfo) {
        super(year, weekOfYear, facility, bookingTime, meetingTitle, userInfo);
    }
}
