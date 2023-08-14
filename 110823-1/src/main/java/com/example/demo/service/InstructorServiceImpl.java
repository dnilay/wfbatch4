package com.example.demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Instructor;
import com.example.demo.repo.InstructorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InstructorServiceImpl implements InstructorService {

	private final InstructorRepository instructorRepository;
	@Override
	public Instructor createInstructor(Instructor instructor) {
		
		return instructorRepository.save(instructor);
	}

	@Override
	public Optional<Instructor> findInstructorById(int id) {
		// TODO Auto-generated method stub
		return instructorRepository.findById(id);
	}

	@Override
	public Instructor updateInstructor(Instructor instructor) {
		// TODO Auto-generated method stub
		return null;
	}

}
