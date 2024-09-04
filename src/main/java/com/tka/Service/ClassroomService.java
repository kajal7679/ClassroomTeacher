package com.tka.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.Dao.ClassroomDao;
import com.tka.Entity.Classroom;

@Service
public class ClassroomService {

	@Autowired
	ClassroomDao classroomdao;

	public ArrayList<Classroom> fetchAllClassroom() {
		System.err.println("i aqm in service layer");
		ArrayList<Classroom> allclass = classroomdao.fetchAllClassroom();
		return allclass;

	}

	

}
