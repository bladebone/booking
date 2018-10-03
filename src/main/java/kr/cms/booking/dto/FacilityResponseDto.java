package kr.cms.booking.dto;

import kr.cms.booking.domain.Facility;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FacilityResponseDto {
    private long id;
    private String code;
    private String title;
    private int sequence;
    private boolean bookable;
    private boolean isAlive;
    private String siteId;

    public FacilityResponseDto(Facility facility) {
        id = facility.getId();
        code = facility.getCode();
        title = facility.getTitle();
        sequence = facility.getSequence();
        bookable = facility.isBookable();
        isAlive = facility.isAlive();
        siteId = facility.getSiteId();
    }
}
