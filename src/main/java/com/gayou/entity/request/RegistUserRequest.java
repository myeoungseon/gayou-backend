package com.gayou.entity.request;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @ToString @Setter @NoArgsConstructor
public class RegistUserRequest {
    private String email;
    private String password;
}
