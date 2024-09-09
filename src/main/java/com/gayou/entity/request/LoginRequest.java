package com.gayou.entity.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString @Setter @NoArgsConstructor
public class LoginRequest {
    private String email;
    private String pass;

    public LoginRequest(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

}
