package com.ttn.bootcamp.spring_security_exercise.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegisterDto {
    @NotBlank(message = "Username required")
    private String userName;

    @NotBlank(message = "Password required")
    private String password;
}
