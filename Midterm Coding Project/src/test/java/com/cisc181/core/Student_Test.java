package com.cisc181.core;

import java.util.UUID;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	

	@Test
	public void test1() throws PersonException {

		ArrayList<Course> Classes = new ArrayList<Course>();
		Classes.add(new Course(UUID.randomUUID(), "Math243", 92));
		Classes.add(new Course(UUID.randomUUID(), "CISC106", 97));
		Classes.add(new Course(UUID.randomUUID(), "ECON101", 98));

		ArrayList<Semester> semesters = new ArrayList<Semester>();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");

		Calendar cal = Calendar.getInstance();
		cal.set(2015, Calendar.MARCH, 3);
		Date date1 = cal.getTime();
		cal.set(2015, Calendar.JUNE, 7);
		Date date2 = cal.getTime();
		cal.set(2016, Calendar.SEPTEMBER, 4);
		Date date3 = cal.getTime();
		cal.set(2016, Calendar.DECEMBER, 8);
		Date date4 = cal.getTime();

		semesters.add(new Semester(UUID.randomUUID(), date1, date2));
		semesters.add(new Semester(UUID.randomUUID(), date3, date4));

		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(
				new Section(Classes.get(0).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 100));
		sections.add(
				new Section(Classes.get(0).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 101));
		sections.add(
				new Section(Classes.get(1).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 200));
		sections.add(
				new Section(Classes.get(1).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 201));
		sections.add(
				new Section(Classes.get(2).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 300));
		sections.add(
				new Section(Classes.get(2).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 301));

		ArrayList<Student> students = new ArrayList<Student>();
		cal.set(1995, Calendar.APRIL, 1);
		Date date5 = cal.getTime();

		students.add(new Student("George", "E", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("George Jr", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("George III", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("George IV", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("George V", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("George VI", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("Georgetta", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("Natalia", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("Leola", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));
		students.add(new Student("Michi", "A", "Foreman", date5, eMajor.PHYSICS, "1 West Avenue", "567-566-8972",
				"George@udel.edu"));

		ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
		for (Student s : students) {
			for (Section c : sections) {
				enrollments.add(new Enrollment(c.getSectionID(), s.getStudentID()));

			}

		}

		for (int x = 0; x <= 5; x++) {
			enrollments.get(x).setGrade(95 + x);
			enrollments.get(x + 6).setGrade(90 + x);
			enrollments.get(x + 12).setGrade(85 + x);
			enrollments.get(x + 18).setGrade(80 + x);
			enrollments.get(x + 24).setGrade(75 + x);
			enrollments.get(x + 30).setGrade(70 + x);
			enrollments.get(x + 36).setGrade(65 + x);
			enrollments.get(x + 42).setGrade(60 + x);
			enrollments.get(x + 48).setGrade(55 + x);
			enrollments.get(x + 54).setGrade(50 + x);
		}
		

		
		double a = 97.5;
		for (int s = 0; s<=9; s++) {
			double x = 0;
			for (Enrollment e : enrollments) {
				if (e.getStudentID() == students.get(s).getStudentID()) {
					x += e.getGrade();
				}

			}
			double sum = x / 6;
			System.out.println(sum);

			assertEquals(sum, a, .00001);
			a-=5;
			
			}

		double b = 72.5;
		for (int c = 0; c<=5; c++) {
			double x = 0;
			for (Enrollment e : enrollments) {
				if (e.getSectionID() == sections.get(c).getSectionID()) {
					x += e.getGrade();
				}

			}
			double sum = x / 10;
			System.out.println(sum);

			assertEquals(sum, b, .00001);
			b+=1;
			
			}

		
		
		
		
		
		
		
	}
	
	
}