package com.project.tacotacoserver.domain.auth.client.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SignUpRequest(
        @NotBlank
        @Email
        String email,
        String name,
        String password
){}