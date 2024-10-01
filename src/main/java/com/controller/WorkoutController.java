package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Workout;
import com.service.WorkoutService;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
	@Autowired
	private WorkoutService workoutService;
	
	@GetMapping
	public List<Workout> getAllWorkout(){
		return workoutService.getAllWorkouts();
	}
	
	@PostMapping
	public Workout createWorkout(@RequestBody Workout workout) {
		return workoutService.saveWorkout(workout);
	}

}
