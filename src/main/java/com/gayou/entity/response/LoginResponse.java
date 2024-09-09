package com.gayou.entity.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter @ToString @Setter @NoArgsConstructor @AllArgsConstructor
public class LoginResponse {
    private HttpStatus httpStatus;
    private String message;
}
