package com.gayou.service;

import com.gayou.entity.User2;
import com.gayou.entity.request.LoginRequest;
import com.gayou.entity.request.RegistUserRequest;
import com.gayou.entity.response.LoginResponse;
import com.gayou.repository.UserRepository2;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository2 userRepository;

    public LoginResponse login(LoginRequest userInfoDto) {
        LoginResponse loginResponse = new LoginResponse();
        try{
            User2 user = userRepository.findByEmail(userInfoDto.getEmail());
            if(user != null && user.getPassword().equals(userInfoDto.getPass())){
                loginResponse.setHttpStatus(HttpStatus.OK);
            }else {
                loginResponse.setMessage("아이디 또는 패스워드를 확인해주세요.");
                loginResponse.setHttpStatus(HttpStatus.UNAUTHORIZED);
            }
        }catch (Exception e) {
            //로그인에러
            loginResponse.setMessage(e.getMessage());
            loginResponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        System.out.println(loginResponse);
        return loginResponse;
    }


    public void changePassword(String email, String newPassword){
        User2 user = userRepository.findByEmail(email);
        System.out.println(user);
        user.changePassword(newPassword);
        userRepository.save(user);
    }

    public void registUser(RegistUserRequest registUserRequest){
        userRepository.save(new User2(registUserRequest.getEmail(), registUserRequest.getPassword()));
    }
}
