package kr.cms.booking.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class BookingReason extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int sequence;

    @Column(nullable = false)
    private boolean isForUser;

    @Builder
    public BookingReason(String code, String title, int sequence, boolean isForUser) {
        this.code = code;
        this.title = title;
        this.sequence = sequence;
        this.isForUser = isForUser;
    }
}
