package kr.cms.booking.service;

import kr.cms.booking.domain.Booking;
import kr.cms.booking.domain.BookingFavorite;

import java.util.List;

public interface FavoriteService {

    List<BookingFavorite> find(String userId);

    void insert(String userId, Booking bookingInfo);

    void update(BookingFavorite bookingFavorite);

    void delete(BookingFavorite bookingFavorite);
}
