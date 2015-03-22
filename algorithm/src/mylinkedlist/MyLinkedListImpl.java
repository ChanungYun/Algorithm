package mylinkedlist;

public class MyLinkedListImpl implements MyLinkedList {
	private Node headNode;
	private int count;
	public MyLinkedListImpl() {
		headNode = new Node();
		count = 0;
	}

	@Override
	public void insert(Object data, int index) {
		if(index > count || index < 0) {
			System.out.println("Insert() Error : " + index + " is wrong index!");
			return;
		}
		Node newNode = new Node(data);
		if(index == 0) {
			newNode.setNext(headNode);
			headNode = newNode;
		} else {
			Node prevNode = get(index-1);
			newNode.setNext(prevNode.getNext());
			prevNode.setNext(newNode);
		}
		count++;
	}

	@Override
	public void delete(int index) {
		if(index > count-1 || index < 0) {
			System.out.println("Delete() Error : " + index + " is wrong index!");
			return;
		}
		if(index == 0) {
			headNode = headNode.getNext();
		} else {
			Node prevNode = get(index-1);
			Node delNode = prevNode.getNext();
			prevNode.setNext(delNode.getNext());
		}
		count--;
	}

	@Override
	public int getCount() {
		return count;
	}
	
	@Override
	public Node get(int index) {
		if(index > this.count-1 || index < 0) {
			System.out.println("Get() Error : " + index + " is wrong index!");
			return null;
		}
		Node curNode = this.headNode;
		while(index-- > 0) {
			curNode = curNode.getNext();
		}
		return curNode;
	}

	public String toString() {
		String retVal = "";
		Node curNode = headNode;
		while(curNode.getNext() != null) {
			retVal += curNode.getData() + " ";
			curNode = curNode.getNext();
		}
		return retVal;
	}
}
