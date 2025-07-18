package com.zidio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zidio.DTO.StudentDTO;
import com.zidio.entity.Student;
import com.zidio.repository.StudentRepository;

@Service
public class StuudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public StudentDTO createOrUpdateStudent(StudentDTO dto) {
		
		Student student = new Student(
				dto.id,dto.name,dto.email,dto.phone,dto.qualification,dto.resumeleURL);
			
		Student saved = (Student) studentRepository.save(student);
		return mapToDTO(saved);
	}

	public StudentDTO getStudentByEmail(String email) {
		Student student = studentRepository.findByEmail(email).orElseThrow(()-> new RuntimeException("student not found"));
		 return mapToDTO(student);
		
	}
	public StudentDTO getStudentById(Long id) {
		Student student = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("student not found"));
		 return mapToDTO(student);
	}
	

	private StudentDTO mapToDTO(Student student) {
		return  new StudentDTO(
				student.getId(),
				student.getName(),
				student.getEmail(),
				student.getPhone(),
				student.getQulification(),
				student.getResumeURL());
				
		
	}
}

