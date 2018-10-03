package kr.cms.booking.dto;

import kr.cms.booking.domain.Site;
import kr.cms.booking.service.FacilityService;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SiteResponseDto {
    private FacilityService facilityService;

    private long id;
    private String code;
    private String title;
    private int sequence;
    private boolean isAlive;
    private int facilityCount;

    public SiteResponseDto(Site site) {
        id = site.getId();
        code = site.getCode();
        title = site.getTitle();
        sequence = site.getSequence();
        isAlive = site.isAlive();
    }

    public void setFacilityCount(int facilityCount) {
        this.facilityCount = facilityCount;
    }
}
