package com.deloitte.HostelSpring.entity;

public class Subject {
	private String subjectName ;
	
	private int marksObtained ;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public Subject(String subjectName, int marksObtained) {
		super();
		this.subjectName = subjectName;
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", marksObtained=" + marksObtained + "]";
	}
	

}
