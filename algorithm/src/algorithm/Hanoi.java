package algorithm;

public class Hanoi {
	static int i=0;
	void hanoi(int n, char a, char b, char c) {
		if(n>0) {
			i++;
			hanoi(n-1, a, c, b);
			System.out.println(n + "��° ������ " + a + "���� " + c + "�� �̵�...");
			hanoi(n-1, b, a, c);
		}
	}
}
