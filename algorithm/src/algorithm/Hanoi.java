package algorithm;

public class Hanoi {
	static int i=0;
	void hanoi(int n, char a, char b, char c) {
		if(n>0) {
			i++;
			hanoi(n-1, a, c, b);
			System.out.println(n + "번째 원반을 " + a + "에서 " + c + "로 이동...");
			hanoi(n-1, b, a, c);
		}
	}
}
