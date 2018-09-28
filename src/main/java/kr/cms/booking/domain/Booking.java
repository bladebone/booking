package kr.cms.booking.domain;

import lombok.Data;

@Data
public class Booking {
    private int year;
    private int weekOfYear;
    private Facility facility;
    private BookingTime[] bookingTime;
    private String meetingTitle;
    private UserInfo userInfo;

    public Booking() {}

    public Booking(int year, int weekOfYear, Facility facility, BookingTime[] bookingTime, String meetingTitle, UserInfo userInfo) {
        this.year = year;
        this.weekOfYear = weekOfYear;
        this.facility = facility;
        this.bookingTime = bookingTime;
        this.meetingTitle = meetingTitle;
        this.userInfo = userInfo;
    }
}
