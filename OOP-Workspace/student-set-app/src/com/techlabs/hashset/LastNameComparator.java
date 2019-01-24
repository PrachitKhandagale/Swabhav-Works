package com.techlabs.hashset;

import java.util.Comparator;

import com.techlabs.student.Student;

public class LastNameComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getLastName().compareTo(o1.getLastName());
	}

}
