package com.das.starter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.starter.models.Rating;

@Repository
public interface CoursesRepository extends JpaRepository<Rating, Long>{}
