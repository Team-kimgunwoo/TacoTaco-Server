package com.project.tacotacoserver.domain.user.exception;

import com.project.tacotacoserver.domain.user.exception.error.UserError;
import com.project.tacotacoserver.global.exception.BusinessException;

public class UserExistException extends BusinessException {

    public static final UserExistException EXCEPTION = new UserExistException();

    public UserExistException() {
        super(UserError.USER_EXIST);
    }

}