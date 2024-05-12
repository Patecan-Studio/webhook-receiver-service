package com.patecan.kiotviet.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AccessTokenResponseDto {
    private String accessToken;
    private int expiresIn;
    private String tokenType;
    private String scope;

    public AccessTokenResponseDto() {
    }

    public AccessTokenResponseDto(String accessToken, int expiresIn, String tokenType, String scope) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
        this.tokenType = tokenType;
        this.scope = scope;
    }
}
