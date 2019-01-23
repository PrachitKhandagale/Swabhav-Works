package headfirst.chapter16;

public class Mountain {
	String name;
	int height;

	Mountain(String n, int h) {
		name = n;
		height = h;
	}

	@Override
	public String toString() {
		return name + " " + height;

	}
}
