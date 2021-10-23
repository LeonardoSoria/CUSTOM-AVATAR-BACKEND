package com.leonardo.customavatar.controller;

import com.leonardo.customavatar.entity.User;
import com.leonardo.customavatar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService patientService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/registerUser")
    public User registerUser(@RequestBody User patient) {
        return patientService.saveUser(patient);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User patient) {
        return patientService.updateUser(patient);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return patientService.getUsers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getUser/{id}")
    public User getUsersById(@PathVariable Long id) {
        return patientService.getUserById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/deleteUser/{id}")
    public User deleteUsers(@PathVariable Long id) {
        return patientService.deleteUser(id);
    }
}
