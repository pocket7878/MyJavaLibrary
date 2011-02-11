package pocket.data.Sheet;
import java.util.Vector;

public class Sheet {
	private Vector data;
	private int width;
	private int height;

	public Sheet() {
		this.width = 1;
		this.height = 1;
		this.data = new Vector(1);
	}

	public Sheet(int w, int h) {
		this.width = w;
		this.height = h;
		this.data = new Vector(this.width * this.height);
	}

	public void resize(int newW, int newH) {
	}

	public void setCell(int x, int y, Object data) {
	}

	public Object getCell(int x, int y) {
	}

	public void turnRight() {
	}

	public void turnLeft() {
	}

	public void hFlip() {
	}

	public void vFlip() {
	}

	public void setRow(int x, Object data[]) {
	}

	public Object[] getRow(int x) {
	}

	public void setCol(int y, Object data[]) {
	}

	public Object[] getCol(int y) {
	}
}
