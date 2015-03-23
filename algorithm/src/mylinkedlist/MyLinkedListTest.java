package mylinkedlist;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedListImpl();
		ll.insert(10, 0); // 10
		System.out.println(ll.toString());
		ll.insert(20, 1); // 10 20
		System.out.println(ll.get(1).getNext());
		ll.insert(30, 2); // 10 20 30
		ll.insert(40, 2); // 10 20 40 30
		ll.insert(50, 0); // 50 10 20 40 30
		ll.insert(60, 10); // Error
		System.out.println(ll.toString());
		ll.delete(0); // 10 20 40 30
		ll.delete(1); // 10 40 30
		ll.delete(2); // 10 40
		ll.delete(10); // Error
		System.out.println(ll.toString());
	}
}
