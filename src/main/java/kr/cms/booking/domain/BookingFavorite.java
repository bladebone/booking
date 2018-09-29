package kr.cms.booking.domain;

import lombok.Data;

@Data
public class BookingFavorite {
    private String userId;
    private int favoriteOrder;
}
