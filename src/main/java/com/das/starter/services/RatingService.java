package com.das.starter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.starter.models.Rating;
import com.das.starter.repositories.CoursesRepository;

@Service
public class RatingService {
	
	@Autowired
	CoursesRepository coursesRepo;

	public List<Rating> getRatings(){
		return coursesRepo.findAll();
	}
	
	public void saveRating(Rating rating) {
		coursesRepo.save(rating);
	}
	
	public Optional<Rating> getRating(Long id) {
		return coursesRepo.findById(id);
	}
	
	public void updateRating(Rating rating) {
		coursesRepo.save(rating);
	}
	
	public void deleteRating(Long id) {
		coursesRepo.deleteById(id);
	}
}
