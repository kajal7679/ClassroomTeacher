package com.tka.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import com.tka.Entity.Classroom;

@Repository
public class ClassroomDao {

	public ArrayList<Classroom> fetchAllClassroom() {
		System.err.println("i am in dao layer");
		ArrayList<Classroom> allclassroom = new ArrayList<Classroom>();
		allclassroom.add(new Classroom(1, "Java"));
		allclassroom.add(new Classroom(2, "HTML"));
		allclassroom.add(new Classroom(3, "Css"));
		allclassroom.add(new Classroom(4, "CoreJava"));
		allclassroom.add(new Classroom(5, "Sql"));
		return allclassroom;

	}
	
	
	

	

//	public static ArrayList<Classroom> fetchAllClassroom() {
//		ArrayList<Classroom> listCls = new ArrayList<>();
//		Configuration cfg = new Configuration();
//		cfg.configure();// read hibernate
//		cfg.addAnnotatedClass(Classroom.class);
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//
//		Criteria criteria = session.createCriteria(Classroom.class);
//
//		ArrayList<Classroom> listOfClassroom = (ArrayList<Classroom>) criteria.list();
//
//		return listOfClassroom;
//	}

}
