package isp.violation.test;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class TestWorker {
	public static void main(String args[]) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		atTheCafeteria(manager);
		atTheCafeteria(robot);//Violation LSP
	}
	public static void atTheWorkStation(IWorker worker) {
		System.out.println("At Work Station:");
		worker.startWork();
		worker.stopWork();
	}
	
	public static void atTheCafeteria(IWorker worker) {
		System.out.println("At the Cafeteria:");
		worker.startEat();
		worker.stopEat();
	}

}
