package com.leonardo.customavatar.repository;

import com.leonardo.customavatar.entity.Face;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaceRepository extends JpaRepository<Face, Long> {
}
