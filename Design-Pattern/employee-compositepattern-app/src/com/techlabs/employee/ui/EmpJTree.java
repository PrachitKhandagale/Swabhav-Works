package com.techlabs.employee.ui;
import java.util.ArrayList;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import com.techlabs.employee.Employee;
import com.techlabs.employee.EmployeeHeirarchyBuild;
import com.techlabs.employee.EmployeeParser;
import com.techlabs.employee.FileLoader;

public class EmpJTree {
	JFrame frame;

	public EmpJTree() throws Exception {
		init();
	}

	public void init() throws Exception {

		FileLoader fileLoader = new FileLoader("dataFile.txt");
		ArrayList<String> list = fileLoader.loadFile();

		EmployeeParser employeeParser = new EmployeeParser();
		Set<Employee> empSet = employeeParser.parse(list);
		EmployeeHeirarchyBuild builder = new EmployeeHeirarchyBuild(empSet);
		Employee rootEmp = builder.getRoot();

		frame = new JFrame();
		
		DefaultMutableTreeNode rootNode=new DefaultMutableTreeNode(rootEmp.getEmpName());
		
		processEmp(rootNode,rootEmp);
		
		JTree jt=new JTree(rootNode);
		frame.add(jt);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	private static void processEmp(DefaultMutableTreeNode rootNode,Employee emp) {
		for(Employee reportee : emp.getEmpList()) {
			DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(reportee.getEmpName());
			rootNode.add(treeNode);
			processEmp(treeNode,reportee);
		}
	}

	public static void main(String[] args) throws Exception {
		new EmpJTree();
	}
}