package com.gayou.entity.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString @Setter @NoArgsConstructor @AllArgsConstructor
public class LogoutRequest {
    private String email;
    private String pass;
}
