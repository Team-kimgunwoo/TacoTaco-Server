package com.project.tacotacoserver.domain.geo.client.api;

import com.project.tacotacoserver.domain.geo.service.response.GeoResponse;
import com.project.tacotacoserver.domain.geo.service.GeoService;
import com.project.tacotacoserver.global.common.response.BaseResponseData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/geo")
@Tag(name = "위치 API")
public class GeoController {

    private final GeoService geoService;

    @GetMapping
    @Operation(summary = "건우 위치 조회", description = "IP를 기반으로 건우의 위치를 조회합니다.")
    public BaseResponseData<GeoResponse> getLocation(HttpServletRequest request) {
        return BaseResponseData.ok("위치 조회 성공", geoService.getLocation(request.getRemoteAddr()));
    }

}