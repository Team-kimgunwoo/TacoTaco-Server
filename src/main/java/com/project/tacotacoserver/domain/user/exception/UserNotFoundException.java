package com.project.tacotacoserver.domain.user.exception;

import com.project.tacotacoserver.domain.user.exception.error.UserError;
import com.project.tacotacoserver.global.exception.BusinessException;

public class UserNotFoundException extends BusinessException {

    public static final UserNotFoundException EXCEPTION = new UserNotFoundException();

    private UserNotFoundException(){
        super(UserError.USER_NOT_FOUND);
    }

}