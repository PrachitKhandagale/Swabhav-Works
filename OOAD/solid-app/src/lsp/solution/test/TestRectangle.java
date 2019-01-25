package lsp.solution.test;

import lsp.solution.RectangleS;
import lsp.solution.SquareS;

public class TestRectangle {

	public static void main(String[] args) {
		RectangleS rectangle=new RectangleS(30, 10);
		SquareS square=new SquareS(10);
		showChanges(rectangle);
	}
	public static void showChanges(RectangleS rectangle) {
		int beforeChange=rectangle.getWidth();
		rectangle.setHeight(100);
		int afterChange=rectangle.getWidth();
		System.out.println("Before:"+beforeChange);
		System.out.println("After:"+afterChange);
	}
}
