package isp.violation;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot Start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot Stop Working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot can't start Eating");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot can't stop Eating");
	}
}
