package com.project.tacotacoserver.domain.geo.service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeoResponse {

    private String requestId;
    private String returnCode;
    private String country;
    private String code;
    private String r1;
    private String r2;
    private String r3;
    private int lat;
    private int lng;
    private String net;

}