package com.ttn.bootcamp.spring_security_exercise.controller;

import com.ttn.bootcamp.spring_security_exercise.dto.request.UserLoginDto;
import com.ttn.bootcamp.spring_security_exercise.dto.request.UserRegisterDto;
import com.ttn.bootcamp.spring_security_exercise.dto.response.UserLoginResponseDto;
import com.ttn.bootcamp.spring_security_exercise.dto.response.UserRegistrationResponseDto;
import com.ttn.bootcamp.spring_security_exercise.enums.Role;
import com.ttn.bootcamp.spring_security_exercise.service.UserService;
import com.ttn.bootcamp.spring_security_exercise.utils.JwtUtils;
import jakarta.validation.Valid;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    public AuthController (UserService userService,  AuthenticationManager authenticationManager, JwtUtils jwtUtils) {
        this.userService = userService;
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
    }

    @PostMapping("/register/user")
    public UserRegistrationResponseDto registerUser(@RequestBody @Valid UserRegisterDto dto) {
        return userService.register(dto, Role.USER);
    }

    @PostMapping("/register/admin")
    public UserRegistrationResponseDto registerAdmin(@RequestBody @Valid UserRegisterDto dto) {
        return userService.register(dto, Role.ADMIN);
    }

    @PostMapping("/login")
    public UserLoginResponseDto login(@RequestBody @Valid UserLoginDto dto) {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                dto.getUserName(),
                                dto.getPassword()
                        )
                );

        if(authentication.isAuthenticated()) {
            return new UserLoginResponseDto(
                    jwtUtils.generateToken(dto.getUserName()),
                    dto.getUserName(),
                    authentication.getAuthorities().iterator().next().getAuthority().replace("ROLE_", "")
            );
        }

        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid username or password");
    }
}
