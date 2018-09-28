package kr.cms.booking.service;

import kr.cms.booking.domain.Booking;
import kr.cms.booking.domain.BookingTime;
import kr.cms.booking.domain.Facility;

import java.util.List;

public interface BookingService {

    List<Booking> findAll();

    List<Booking> find(List<BookingTime> bookingTimeList, List<Facility> facilityList);

    void insert(Booking bookingInfo);

    void update(Booking bookingInfo);

    void delete(Booking bookingInfo);
}
