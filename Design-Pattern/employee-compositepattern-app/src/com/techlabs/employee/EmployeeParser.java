package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeParser {
	private Set<Employee> empSet = new TreeSet<Employee>();

	public Set<Employee> parse(ArrayList<String> data) throws Exception {
		String split = ",";
		
		for (String line : data) {
			String string = line;
			String[] linedata = string.split(split);

			Integer id = Integer.parseInt(linedata[0]);
			String name = linedata[1];
			String designation = linedata[2];
			Integer managerId=linedata[3].equalsIgnoreCase("NULL")?null:Integer.parseInt(linedata[3]);
			Employee employee = new Employee(id, managerId, name, designation);
			empSet.add(employee);
		}
		return empSet;

	}

}


			
			
			
			
			
			
			
			
			
			
			
			
			
//			String[] row = str.split(",");
//			empSet.add(new Employee(Integer.parseInt(row[0]),row[3].equalsIgnoreCase("NULL")?null:Integer.parseInt(row[3]),row[1] + "-" + row[2]));
			
			
		