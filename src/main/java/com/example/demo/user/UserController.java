package com.example.demo.user;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.text.ParseException;
import java.util.List;

@RestController
@Tag(name = "User")
@RequestMapping(path= "api/v1/users")
public class UserController {
    private final UserService userService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/postgres-count")
    public ResponseEntity<String> getCount() {
        String query = "SELECT COUNT(*) FROM auth.users";
        Integer count = jdbcTemplate.queryForObject(query, Integer.class);
        return new ResponseEntity<>("Total users: " + count, HttpStatus.OK);
    }

    @GetMapping("/mysql-count")
    public ResponseEntity<String> getAccounts() {
        String query = "SELECT COUNT(u.id) FROM users u";
        System.out.println(query);
        Integer count = jdbcTemplate.queryForObject(query, Integer.class);
        return new ResponseEntity<>("Total users: " + count, HttpStatus.OK);
    }
}
