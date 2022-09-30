package com.hackerrank.weather.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class UserContactDTO {

    @Getter @Setter private String id;
    @Getter @Setter private String userCode;
    @Getter @Setter private String address;
}
