package com.gayou.Controller;

import com.gayou.entity.request.ChangePasswordRequest;
import com.gayou.entity.request.RegistUserRequest;
import com.gayou.entity.response.LogoutResponse;
import com.gayou.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.gayou.entity.request.LoginRequest;
import com.gayou.entity.response.LoginResponse;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user2")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void registUser(@RequestBody RegistUserRequest registUserRequest) {
        System.out.println("test");
        System.out.println(registUserRequest.getEmail());
        userService.registUser(registUserRequest);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest userInfoDto){
        return userService.login(userInfoDto);
    }

    @GetMapping("/logout")
    public LogoutResponse removeToken(HttpServletRequest request) {
        LogoutResponse logoutResponse = new LogoutResponse();
        logoutResponse.setMessage("로그아웃되었습니다.");
        return logoutResponse;
    }

    @PostMapping("/changePassword")
    public void changePassword(@RequestBody ChangePasswordRequest changePasswordRequest, HttpServletRequest request){
        System.out.println("비밀번호 변경시작");
        userService.changePassword(changePasswordRequest.getEmail(), changePasswordRequest.getNewPassword());
    }
}
