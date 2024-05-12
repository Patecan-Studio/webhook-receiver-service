package com.patecan.kiotviet.connect;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import com.patecan.kiotviet.configurations.FormFeignEncoderConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.*;

@FeignClient(name = "kiotviet", url = "https://id.kiotviet.vn", configuration = FormFeignEncoderConfig.class)
public interface KiotVietConnectApi {
    @PostMapping(value = "/connect/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String getKiotVietAccessToken(Map<String, ?> data);

}
