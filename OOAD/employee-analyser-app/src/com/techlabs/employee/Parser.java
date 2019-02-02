package com.techlabs.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Parser {
	private ILoader iLoader;
	private Set<EmployeeDetails> empDataSet = new TreeSet<EmployeeDetails>();

	public Parser(ILoader iloader) {
		this.iLoader = iloader;
	}

	public void parse() throws Exception {
		String split = ",";
		List<String> data = new ArrayList<String>();
		data = iLoader.load();
		for (String line : data) {
			String string = line;
			String[] linedata = string.split(split);

			int id = Integer.parseInt(linedata[0]);
			String name = linedata[1];
			String designation = linedata[2];
			String mangerId = linedata[3];
			String dateOfJoining = linedata[4];
			long salary = Integer.parseInt(linedata[5]);
			String commission = linedata[6];
			int department = Integer.parseInt(linedata[7]);

			EmployeeDetails employee = new EmployeeDetails(id, name, designation, mangerId, dateOfJoining, salary, commission,
					department);

			empDataSet.add(employee);
		}
	}

	public ILoader getIloader() {
		return iLoader;
	}

	public void setIloader(ILoader iloader) {
		this.iLoader = iloader;
	}

	public Set<EmployeeDetails> getEmpDataSet() {
		return empDataSet;
	}

	public void setEmpDataSet(Set<EmployeeDetails> empDataSet) {
		this.empDataSet = empDataSet;
	}
}
