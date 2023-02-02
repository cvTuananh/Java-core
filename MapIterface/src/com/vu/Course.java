package com.vu;

public class Course implements Comparable<Course> {
	private int id;
	private String name;
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.id).compareTo(o.getId());
	}


	
	
	
}
