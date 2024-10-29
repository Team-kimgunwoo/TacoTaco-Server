package com.project.tacotacoserver.domain.geo.exception.error;

import com.project.tacotacoserver.global.exception.error.ErrorProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum GeoError implements ErrorProperty {

    API_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Geo API 서버 에러");

    private final HttpStatus status;
    private final String message;

}
