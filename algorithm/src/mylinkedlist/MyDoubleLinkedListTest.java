package mylinkedlist;

public class MyDoubleLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList dll = new MyDoubleLinkedListImpl();
		dll.insert(10, 0); // 10
		System.out.println(dll.get(0).getPrev());
		System.out.println(dll.get(0).getNext());
		dll.insert(20, 1); // 10 20
		System.out.println(dll.get(0).getPrev());
		System.out.println(dll.get(0).getNext().getData());
		System.out.println(dll.get(1).getPrev().getData());
		System.out.println(dll.get(1).getNext());
		dll.insert(30, 2); // 10 20 30
		dll.insert(40, 1); // 10 40 20 30
		dll.insert(50, 0); // 50 10 40 20 30
		System.out.println(dll.toString());
		dll.delete(0); // 10 40 20 30
		System.out.println(dll.get(0).getPrev());
		System.out.println(dll.toString());
		dll.delete(1); // 10 20 30
		System.out.println(dll.toString());
		dll.delete(2); // 10 20
		System.out.println(dll.toString());
		System.out.println(dll.get(0).getPrev());
		System.out.println(dll.get(0).getNext().getData());
		System.out.println(dll.get(1).getPrev().getData());
		System.out.println(dll.get(1).getNext());
	}

}
