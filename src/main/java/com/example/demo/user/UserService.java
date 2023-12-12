package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserEntity userEntity;

    public List<UserEntity> getUsers() {
        return List.of(userEntity);
        //return List.of(new User(1L, "sophatbio", "sophat@sophat.bio", LocalDate.of(2023, Month.DECEMBER, 11)));
    }
}
