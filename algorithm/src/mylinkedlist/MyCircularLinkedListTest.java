package mylinkedlist;

public class MyCircularLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList cll = new MyCircularLinkedListImpl();
		cll.insert(10, 0); // 10
		System.out.println(cll.get(0).getNext().getData()); // 10
		cll.insert(20, 1); // 10 20
		cll.insert(30, 2); // 10 20 30
		cll.insert(40, 0); // 40 10 20 30
		cll.insert(50, 1); // 40 50 10 20 30
		System.out.println(cll.toString());
		System.out.println(cll.get(4).getNext().getData()); // 40
	}
}
