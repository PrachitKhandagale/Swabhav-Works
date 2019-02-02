package dep.solution;

public class XMLogger implements ILogger{

	@Override
	public void log(String message) {
		System.out.println(message);
	}

}
