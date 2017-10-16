package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		cal.set(1980, Calendar.MARCH, 3); 
		Date date1 = cal.getTime();
		cal.set(2015, Calendar.JUNE, 7);
		Date date2 = cal.getTime();
		
		
		ArrayList<Staff> testStaff = new ArrayList<Staff>();
		
		testStaff.add(new Staff("Bob", "L", "Smith",
			date1, "35 West Street", "451-678-3454", "Bob@gmailcom",
			"9 to 5", 3, 15.80, date2,
			eTitle.MR));
		
		testStaff.add(new Staff("Mark", "A", "Doe",
				date1, "82 East Street", "877-690-3455", "Mark@gmailcom",
				"8 to 5", 2, 14.80, date2,
				eTitle.MRS));
		
		testStaff.add(new Staff("Joe", "A", "Doe",
				date1, "82 East Street", "877-690-3455", "Mark@gmailcom",
				"8 to 5", 2, 20.55, date2,
				eTitle.MRS));
		
		testStaff.add(new Staff("Mark", "A", "Doe",
				date1, "82 East Street", "877-690-3455", "Mark@gmailcom",
				"8 to 5", 2, 7.85, date2,
				eTitle.MRS));
		
		testStaff.add(new Staff("Mark", "A", "Doe",
				date1, "82 East Street", "877-690-3455", "Mark@gmailcom",
				"8 to 5", 2, 12.20, date2,
				eTitle.MRS));
		
		double salAvg = (testStaff.get(1).getSalary() + testStaff.get(2).getSalary() +testStaff.get(3).getSalary() +testStaff.get(4).getSalary() +testStaff.get(0).getSalary())/5.0;
		
		assertEquals(salAvg,14.24,.00001);
	}	
	
	@Test (expected = PersonException.class)
	public void test2() throws PersonException {
	
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	
	Calendar cal = Calendar.getInstance();
	cal.set(1800, Calendar.MARCH, 3); 
	Date date1 = cal.getTime();
	cal.set(2015, Calendar.JUNE, 7);
	Date date2 = cal.getTime();
	
	Staff Mark = new Staff("Mark", "A", "Doe",
			date1, "82 East Street", "877-690-345", "Mark@gmailcom",
			"8 to 5", 2, 12.20, date2,
			eTitle.MRS);
	
	
	
	
	
	}

}
