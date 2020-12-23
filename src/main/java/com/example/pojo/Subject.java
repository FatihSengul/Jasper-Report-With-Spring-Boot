package com.example.pojo;

public class Subject {

	private String subjectName;
	private long marksObtained;

	public Subject(String subjectName, long marksObtained) {
		this.subjectName = subjectName;
		this.marksObtained = marksObtained;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public long getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(long marksObtained) {
		this.marksObtained = marksObtained;
	}

}
