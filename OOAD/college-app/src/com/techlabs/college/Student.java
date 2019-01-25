package com.techlabs.college;

import java.text.DateFormat;

public class Student extends Person{
	private Branch branch;
	public Student(int id, String address, String date,Branch branch) {
		super(id, address, date);
		this.branch=branch;
	}
	public Branch getBranch() {
		return branch;
	}
	@Override
	public String toString() {
		return super.toString()+" "+this.branch;
	}
	
}
