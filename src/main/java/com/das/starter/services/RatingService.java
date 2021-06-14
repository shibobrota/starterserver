package com.das.starter.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.starter.models.Rating;
import com.das.starter.repositories.CoursesRepoInterface;

@Service
public class RatingService {
	
	@Autowired
	CoursesRepoInterface coursesRepo;

	public List<Rating> getRatings(){
		return coursesRepo.findAll();
	}
	
	public void saveRating(Rating rating) {
		coursesRepo.save(rating);
	}
}
