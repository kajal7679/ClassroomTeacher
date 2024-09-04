package com.tka.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Entity.Classroom;
import com.tka.Service.ClassroomService;

@RestController
public class ClassroomController {
	@Autowired
	ClassroomService classroomservice;

	//// 1
	@GetMapping("fetchclassroom")
	public ArrayList<Classroom> fetchAllClassroom() {
		System.err.println("i am in controller");
		return classroomservice.fetchAllClassroom();

	}

	

//////2
//	@GetMapping("classroomperSize/{id}")
//	public static Classroom getClassroomDetailperSize() {
//		ArrayList<Classroom> allClassroom = new ArrayList<Classroom>();
//		allClassroom.add(new Classroom(1, "JavaClassroom"));
//		allClassroom.add(new Classroom(2, "PythonClassroom"));
//		allClassroom.add(new Classroom(3, "HTMLClassroom"));
//		allClassroom.add(new Classroom(4, "HibernateClassroom"));
//		allClassroom.add(new Classroom(5, "SQLClassroom"));
//
//		return new Classroom(1, "JavaClassroom");
//	}

}
