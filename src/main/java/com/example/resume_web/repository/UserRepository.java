package com.example.resume_web.repository;

import com.example.resume_web.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserQueryDSL {
}
