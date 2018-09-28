package kr.cms.booking.service;

import kr.cms.booking.domain.BookingReserved;

import java.util.List;

public interface ReserveService {

    List<BookingReserved> getBookingReservedList();

    void insertBookingReserved(BookingReserved bookingReserved);

    void deleteBookingReserved(BookingReserved bookingReserved);
}
