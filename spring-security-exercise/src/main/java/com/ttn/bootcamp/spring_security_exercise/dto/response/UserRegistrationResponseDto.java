package com.ttn.bootcamp.spring_security_exercise.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationResponseDto {
    private Long id;
    private String userName;
    private String role;
    private String message;
}
