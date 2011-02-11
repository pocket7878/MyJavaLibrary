package pocket.data.Sheet;

public class Sheet {
	private Object data[][];
	private int width;
	private int height;

	public Sheet() {
		this.width = 1;
		this.height = 1;
		this.data = new Object[this.width][this.height];
	}

	public Sheet(int w, int h) {
		this.width = w;
		this.height = h;
		this.data = new Object[this.width][this.height];
	}

	public void resize(int newW, int newH) {
		Object newData = new Object[newW][newH];
		for(int i = 0; i < this.width && i < this.newW; i++) {
			for(int j = 0; j < this.height && j < this.newW; j++) {
				newData[i][j] = this.data[i][j];
			}
		}
		this.data = newData;
	}

	public void setCell(int x, int y, Object data) {
		this.data[x][y] = data;
	}

	public Object getCell(int x, int y) {
		return this.data[x][y];
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
		Object returnData = new Object[this.height];
		for(int i = 0; i < this.height; i++) {
			returnData[i] = this.data[x][i];
		}
	}

	public void setCol(int y, Object data[]) {
	}

	public Object[] getCol(int y) {
		Object returnData = new Object[this.width];
		for(int i = 0; i < this.width; i++) {
			returnData[i] = this.data[i][y];
		}
	}
}
