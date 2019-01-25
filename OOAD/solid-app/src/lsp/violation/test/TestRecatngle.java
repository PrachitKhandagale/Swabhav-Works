package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class TestRecatngle {

	public static void main(String[] args) {
		showChanges(new Rectangle(30, 10));
		showChanges(new Square(20));
		
	}
	
	public static void showChanges(Rectangle rectangle) {
		int beforeChange=rectangle.getWidth();
		rectangle.setHeight(100);
		int afterChange=rectangle.getWidth();
		System.out.println("Before:"+beforeChange);
		System.out.println("After:"+afterChange);
	}

}
