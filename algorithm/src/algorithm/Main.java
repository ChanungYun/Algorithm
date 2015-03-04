package algorithm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hanoi h = new Hanoi();
		h.hanoi(3, '1', '2', '3');
		System.out.println(h.i);
	}

}
