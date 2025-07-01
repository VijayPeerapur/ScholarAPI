package com.scholar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scholars")
public class Scholar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;

	@Column(name = "scholar_name")
	private String name;

	@Column(name = "percent")
	private float percentage;

	@Column(name = "branch")
	private String course;

	public Scholar() {

	}

	public Scholar(int rollNo, String name, float percentage, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Scholar [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", course=" + course
				+ "]";
	}

}
