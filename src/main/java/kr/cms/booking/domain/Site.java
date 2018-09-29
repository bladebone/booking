package kr.cms.booking.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Site extends BaseTimeEntity {

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
    private boolean isAlive;

    @Builder
    public Site(String code, String title, int sequence, boolean isAlive) {
        this.code = code;
        this.title = title;
        this.sequence = sequence;
        this.isAlive = isAlive;
    }
}
