package com.application.Application.controller;

import com.application.Application.dto.UserDTO;
import com.application.Application.entity.User;
import com.application.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/auth")
//@CrossOrigin(origins = "*")
@CrossOrigin(origins = "http://localhost:4200") 
public class UserController {

    @Autowired
    private UserService userService;
   
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody UserDTO userDTO) {
        User registeredUser = userService.registerUser(userDTO);
        return ResponseEntity.ok(registeredUser); // Returning user with ID
    }
}
