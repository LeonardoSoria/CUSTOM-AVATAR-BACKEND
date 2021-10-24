package com.leonardo.customavatar.service;

import com.leonardo.customavatar.DTO.UserDTO;
import com.leonardo.customavatar.entity.User;
import com.leonardo.customavatar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDTO user) {
        return userRepository.save(User.builder()
                .name(user.getName())
                .lastname(user.getLastname())
                .username(user.getUsername())
                .password(user.getPassword())
                .build());
    }

    public User login(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username, password).stream().findFirst().orElse(null);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        User currentUser = userRepository.findById(user.getId()).orElse(null);
        currentUser.setName(user.getName());
        currentUser.setLastname(user.getLastname());
        return userRepository.save(currentUser);
    }

    public User deleteUser(Long id) {
        userRepository.deleteById(id);
        return null;
    }

}
