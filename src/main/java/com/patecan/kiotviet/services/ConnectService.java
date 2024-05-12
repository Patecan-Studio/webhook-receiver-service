package com.patecan.kiotviet.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.patecan.kiotviet.connect.KiotVietConnectApi;
import com.patecan.kiotviet.dto.AccessTokenResponseDto;
import com.patecan.kiotviet.model.configuration.KiotVietCredential;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class ConnectService {

    @Autowired
    private ModelMapper modelMapper;

    private KiotVietCredential kiotVietCredential;

    private final KiotVietConnectApi kiotVietConnectApi;

    public ConnectService(KiotVietCredential kiotVietCredential, KiotVietConnectApi kiotVietConnectApi) {
        this.kiotVietCredential = kiotVietCredential;
        this.kiotVietConnectApi = kiotVietConnectApi;
    }

    public AccessTokenResponseDto getKiotVietAccessToken() {
        Map<String, String> params = new HashMap<>();
        params.putIfAbsent("scope",kiotVietCredential.getScope());
        params.putIfAbsent("grant_type",kiotVietCredential.getGrantType());
        params.putIfAbsent("client_id",kiotVietCredential.getClientId());
        params.putIfAbsent("client_secret",kiotVietCredential.getClientSecret());

        String response = kiotVietConnectApi.getKiotVietAccessToken(params);

        System.out.println(response);
        AccessTokenResponseDto accessTokenResponseDto = this.convertToDto(response);
        return accessTokenResponseDto;
    }


    private AccessTokenResponseDto convertToDto(String response) {
        AccessTokenResponseDto accessTokenResponseDto = modelMapper.map(response, AccessTokenResponseDto.class);
        return accessTokenResponseDto;
    }
}
