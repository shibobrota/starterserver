package com.das.starter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.das.starter.models.Error;
import com.das.starter.models.Rating;
import com.das.starter.services.FetchRatingService;

@RestController
public class MainController {
	
	@Autowired
	FetchRatingService fetchRatingService;

	@GetMapping("/")
	public String base() {
		return "Invalid Request";
	}
	
	@GetMapping({"/list", "/list/{projectId}"})
	public Error getList(@PathVariable(required = false) Integer projectId) {
		if(projectId != null) {
			System.out.println(projectId);
		}
		
		Error err = new Error(120, "Sample Error Description");
		return err;
	}
	
	@PostMapping({"/list", "/list/{projectId}"})
	public List<Rating> postList(@PathVariable(required = false) Integer projectId, @RequestBody(required = true) Rating rating)
	{
		if(rating != null) {
			System.out.println(rating.toString());
		}
		
		if(projectId != null) {
			System.out.println(projectId);
		}
		
		return fetchRatingService.getRatings(); 
	}
	
	@PostMapping({"/new"})
	public List<Rating> postNew(@RequestBody(required = true) Rating rating)
	{
		if(rating != null) {
			System.out.println(rating.toString());
		}
		
		return fetchRatingService.getRatings(); 
	}
		
}
