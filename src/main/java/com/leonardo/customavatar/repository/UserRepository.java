package com.leonardo.customavatar.repository;

import com.leonardo.customavatar.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
