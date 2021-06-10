package com.das.starter.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.das.starter.models.Rating;

@Service
public class FetchRatingService {
	
	List<Rating> ratings;
	
	public FetchRatingService() {
		this.ratings = new ArrayList<>();
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			this.ratings.add(new Rating(4, "Good", rand.nextInt(1000000), rand.nextInt(10000), rand.nextInt(100), rand.nextInt(1000), "User "+i));
		}
	}

	public List<Rating> getRatings(){
		return this.ratings;
	}
}
