package com.SWEProject.teahcer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.SWEProject.Teacher;

public class TeacherService {
	
	private List<Teacher> teachers = new ArrayList<>(Arrays.asList (
			 new Teacher("Takeda Sensei", "sensei", "male", "sensei@gmail.com", "123", "s.jpeg", 1),
			 new Teacher("Ukai Coach", "coach", "male", "coach@gmail.com", "123", "c.jpg", 2),
			 new Teacher("Teacher3","teach3", "male", "teach3@gmail.com", "123", "default-user.png", 3),
			 new Teacher("Teacher4", "teach4", "male", "teach4@gmail.com", "123", "default-user.png", 4)
			));	
		
	public List<Teacher> getAllTeachers() {
		return teachers; 
	}
	
	public Teacher getTeacher(String username) {
		return teachers.stream().filter(t -> t.getUsername().equals(username)).findFirst().get();
	}
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
	}
}
