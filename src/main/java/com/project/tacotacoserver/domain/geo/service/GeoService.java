package com.project.tacotacoserver.domain.geo.service;

import com.project.tacotacoserver.domain.geo.service.response.GeoResponse;
import com.project.tacotacoserver.domain.geo.exception.GeoErrorException;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@RequiredArgsConstructor
public class GeoService {

    private final RestTemplate restTemplate;

    @Value("${geo.api-url}")
    private String url;
//    @Value("${geo.client-id}")
//    private String clientId;
//    @Value("${geo.client-secret}")
//    private String clientSecret;

    public GeoResponse getLocation(String ip) {
        URI uri = UriComponentsBuilder
                .fromUriString(url)
                .path("/geoLocation")
                .queryParam("ip", ip)
                .queryParam("ext", "f")
                .queryParam("enc", "utf8")
                .queryParam("responseFormatType", "json")
                .encode()
                .build()
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-NCP-APIGW-API-KEY-ID", ""); // 네이버 Client ID
        headers.set("X-NCP-APIGW-API-KEY", ""); // 네이버 Client Secret
        HttpEntity<Void> entity = new HttpEntity<>(headers);
        ResponseEntity<GeoResponse> responseEntity = restTemplate.exchange(
                uri,
                HttpMethod.GET,
                entity,
                GeoResponse.class
        );
        if(responseEntity.getStatusCode().is4xxClientError()) {
            throw GeoErrorException.EXCEPTION;
        }
        return responseEntity.getBody();
    }

}