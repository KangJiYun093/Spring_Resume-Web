package com.example.resume_web.repository;

import com.example.resume_web.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
