package isp.solution;

public class Manager implements IWorkEat {

	@Override
	public void startEat() {
		System.out.println("Manager Start Eat");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stop Eat");
	}

	@Override
	public void startWork() {
		System.out.println("Manager Start Work");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager Stop Work");
	}

}
