package com.vu.assement02;

import java.io.Serializable;

public class Course implements Comparable<Course>,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1502328103299571033L;
	private int id;
	private String course;
	private String description;
	
	public Course(int id, String course, String description) {
		super();
		this.id = id;
		this.course = course;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", description=" + description + "]";
	}

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.id).compareTo(o.getId());
	}
	
	
	
	
}
