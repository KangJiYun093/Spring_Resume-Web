package com.example.resume_web.repository;

import com.example.resume_web.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

import static com.example.resume_web.entity.QUser.user;


@RequiredArgsConstructor
public class UserQueryDSLImpl implements UserQueryDSL {
    private final JPAQueryFactory query;

    @Override
    public Optional<User> login(String userEmail, String userPassword) {
        return Optional.ofNullable(
                query.select(user)
                        .from(user)
                        .where(user.userEmail.eq(userEmail)
                                .and(user.userPassword.eq(userPassword)))
                        .fetchOne());
    }
}
