package lsp.solution;

public class SquareS implements IPolygon{
	protected int side;

	public SquareS(int side) {
		this.side=side;
	}

	@Override
	public int calculateArea() {
		return side*side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
}
