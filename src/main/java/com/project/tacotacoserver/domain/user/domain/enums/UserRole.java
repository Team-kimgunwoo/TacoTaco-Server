package com.project.tacotacoserver.domain.user.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserRole {

    USER("ROLE_USER"),
    GUNWOO("GUNWOO");

    private final String key;

}
