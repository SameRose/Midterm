package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) {
		setSemesterID(SemesterID);
		setStartDate(StartDate);
		setEndDate(EndDate);
		
	}
	
	
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
}
