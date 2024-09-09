package com.gayou.repository;

import com.gayou.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository2 extends JpaRepository<User2, Long> {
    User2 findByEmail(String id);
}
