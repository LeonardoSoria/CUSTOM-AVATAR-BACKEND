package com.leonardo.customavatar.service;

import com.leonardo.customavatar.entity.User;
import com.leonardo.customavatar.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository patientRepository;

    public User saveUser(User user) {
        return patientRepository.save(user);
    }

    public List<User> getUsers() {
        return patientRepository.findAll();
    }

    public User getUserById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        User currentUser = patientRepository.findById(user.getId()).orElse(null);
        currentUser.setName(user.getName());
        currentUser.setLastname(user.getLastname());
        currentUser.setBirthdate(user.getBirthdate());
        return patientRepository.save(currentUser);
    }

    public User deleteUser(Long id) {
        patientRepository.deleteById(id);
        return null;
    }

}
