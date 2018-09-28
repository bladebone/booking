package kr.cms.booking.domain;

import lombok.Data;

@Data
public class BookingFavorite extends Booking {
    private String userId;
    private int favoriteOrder;

    public BookingFavorite() {}

    public BookingFavorite(int year, int weekOfYear, Facility facility, BookingTime[] bookingTime, String meetingTitle, UserInfo userInfo, String userId, int favoriteOrder) {
        super(year, weekOfYear, facility, bookingTime, meetingTitle, userInfo);
        this.userId = userId;
        this.favoriteOrder = favoriteOrder;
    }
}
