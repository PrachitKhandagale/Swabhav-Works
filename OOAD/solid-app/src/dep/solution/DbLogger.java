package dep.solution;

public class DbLogger implements ILogger{

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
