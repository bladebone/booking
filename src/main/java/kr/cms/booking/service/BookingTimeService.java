package kr.cms.booking.service;

import kr.cms.booking.domain.BookingTime;

import java.util.List;

public interface BookingTimeService {

    List<BookingTime> findAll();

    void enableTime(BookingTime bookingTime);

    void disableTime(BookingTime bookingTime);
}
