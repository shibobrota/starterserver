package com.das.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.das.starter.models.Rating;

public interface CoursesRepoInterface extends JpaRepository<Rating, Long>{}
