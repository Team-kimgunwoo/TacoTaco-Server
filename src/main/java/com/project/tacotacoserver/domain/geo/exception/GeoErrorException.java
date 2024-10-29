package com.project.tacotacoserver.domain.geo.exception;

import com.project.tacotacoserver.domain.geo.exception.error.GeoError;
import com.project.tacotacoserver.global.exception.BusinessException;

public class GeoErrorException extends BusinessException {

    public static final GeoErrorException EXCEPTION = new GeoErrorException();

    private GeoErrorException(){
        super(GeoError.API_ERROR);
    }

}
