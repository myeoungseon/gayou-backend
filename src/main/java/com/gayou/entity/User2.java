package com.gayou.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

//유저
@Entity @Getter
public class User2 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private Long userNo;

    @Column(unique = true)
    private String email;

    private String password;

    public User2(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User2() {

    }

    public void changePassword(String password){
        this.password = password;
    }

    public void join(String id, String password){
        this.email = email;
        this.password = password;
    }
}

