package isp.solution.test;

import isp.solution.IEat;
import isp.solution.IWork;
import isp.solution.Manager;
import isp.solution.Robot;

public class TestWorker {

	public static void main(String[] args) {
		Manager manager=new Manager();
		Robot robot=new Robot();
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		atTheCafeteria(manager);
		//atTheCafeteria(robot);
	}
	
	public static void atTheWorkStation(IWork worker) {
		System.out.println("At Work Station:");
		worker.startWork();
		worker.stopWork();
	}
	
	public static void atTheCafeteria(IEat eat) {
		System.out.println("At the Cafeteria:");
		eat.startEat();
		eat.stopEat();
	}
}
