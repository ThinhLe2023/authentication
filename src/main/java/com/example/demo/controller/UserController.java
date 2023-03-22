package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService service;

    @PostMapping("/login")
    ResponseEntity login(@Valid @RequestBody User criteria) {
        if (service.getValuationUser(criteria)) {
            return new ResponseEntity<>(service.getValuationUser(criteria), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/user/{id}")
    User findOne(@PathVariable Long id) {
        return service.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
