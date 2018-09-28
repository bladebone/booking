package kr.cms.booking.domain;

import lombok.Data;

@Data
public class UserInfo {
    private String userId;
    private String userName;
    private String teamId;
    private String teamName;
    private String cell;
    private String cellPhone;
}
