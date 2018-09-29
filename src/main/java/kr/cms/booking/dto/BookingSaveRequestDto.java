package kr.cms.booking.dto;

import kr.cms.booking.domain.Booking;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BookingSaveRequestDto {

    private long facilityId;
    private int year;
    private int weekOfYear;
    private LocalDateTime bookingDate;
    private long bookingTimeId;
    private long meetingTitleId;
    private long userId;

    public Booking toEntity() {
        return Booking.builder()
                .facilityId(facilityId)
                .year(year)
                .weekOfYear(weekOfYear)
                .bookingDate(bookingDate)
                .bookingTimeId(bookingTimeId)
                .meetingTitleId(meetingTitleId)
                .userId(userId)
                .build();
    }
}
