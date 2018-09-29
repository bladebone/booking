package kr.cms.booking.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Booking extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private long facilityId;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private int weekOfYear;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private long bookingTimeId;

    @Column(nullable = false)
    private long meetingTitleId;

    @Column(nullable = false)
    private long userId;

    @Builder
    public Booking(long facilityId, int year, int weekOfYear, LocalDateTime bookingDate, long bookingTimeId, long meetingTitleId, long userId) {
        this.facilityId = facilityId;
        this.year = year;
        this.weekOfYear = weekOfYear;
        this.bookingDate = bookingDate;
        this.bookingTimeId = bookingTimeId;
        this.meetingTitleId = meetingTitleId;
        this.userId = userId;
    }
}
