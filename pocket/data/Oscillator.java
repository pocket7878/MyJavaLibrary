package pocket.data;

import java.util.ArrayList;

public class Oscillator {
	private int size;
	private int pos;
	private ArrayList data;	

	public Oscillator() {
		this.pos = 0;
		this.data = new ArrayList();
	}

	public Oscillator(ArrayList arr) {
		this.pos = 0;
		this.data = arr;
	}

	public Object next() {
		Object var = this.data.get(this.pos);
		if(this.data.size() >= this.pos) {
			this.pos++;
		}
		else {
			this.pos = 0;
		}
		return var;
	}

	public void add(Object obj) {
		this.data.add(obj);
	}

	public int size() {
		return this.data.size();
	}

	public int getPos() {
		return this.pos;
	}
}
