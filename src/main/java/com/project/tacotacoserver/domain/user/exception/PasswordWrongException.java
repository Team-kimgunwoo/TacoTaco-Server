package com.project.tacotacoserver.domain.user.exception;

import com.project.tacotacoserver.domain.user.exception.error.UserError;
import com.project.tacotacoserver.global.exception.BusinessException;

public class PasswordWrongException extends BusinessException {

    public static final PasswordWrongException EXCEPTION = new PasswordWrongException();

    private PasswordWrongException(){
        super(UserError.PASSWORD_WRONG);
    }

}