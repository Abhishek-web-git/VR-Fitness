package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Workout;
import com.repository.WorkoutRepository;

@Service
public class WorkoutService {
	@Autowired
	private WorkoutRepository workoutRepository;
	public List<Workout> getAllWorkouts(){
		return workoutRepository.findAll();
	}
	public Workout saveWorkout(Workout workout) {
		return workoutRepository.save(workout);
	}

}
