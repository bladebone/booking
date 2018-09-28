package kr.cms.booking.domain;

import lombok.Data;

@Data
public class Facility {
    private String facilityId;
    private int facilityOrder;
    private String facilityName;
    private boolean bookable;
    private boolean isAlive;
    private String areaId;
}
