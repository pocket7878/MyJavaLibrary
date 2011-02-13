import pocket.data.Oscillator;

class oscillatorTest {
	public static void main(String[] args) {
		Oscillator osc = new Oscillator();
		osc.add(1);
		osc.add(2);
		osc.add("Hello,Oscillator");
		for(int i = 0; i < 9; i++) {
			System.out.println(i + ": " + osc.next());
		}
	}
}
