package mylinkedlist;

public class MyDoubleLinkedListImpl implements MyLinkedList {
	private Node headNode;
	private int count;
	public MyDoubleLinkedListImpl() {
		headNode = null;
		count = 0;
	}
	@Override
	public void insert(Object data, int index) {
		if(index > count || index < 0) {
			System.out.println("insert error");
		}
		Node newNode = new Node(data);
		if(index == 0) {
			newNode.setNext(headNode);
			headNode = newNode;
			if(headNode.getNext() != null)
				headNode.getNext().setPrev(newNode);
		} else {
			Node prevNode = get(index-1);
			newNode.setNext(prevNode.getNext());
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
			if(newNode.getNext() != null)
				newNode.getNext().setPrev(newNode);
		}
		count++;
	}
	
	@Override
	public void delete(int index) {
		if(index > count-1 || index < 0) {
			System.out.println("delete error");
		}
		if(index == 0) {
			Node delNode = headNode;
			headNode = headNode.getNext();
			headNode.setPrev(null);
			if(headNode.getNext() != null) 
				headNode.getNext().setPrev(headNode);
			delNode = null;
		} else {
			Node prevNode = get(index-1);
			Node delNode = prevNode.getNext();
			prevNode.setNext(delNode.getNext());
			if(delNode.getNext() != null)
				delNode.getNext().setPrev(prevNode);
			delNode = null;
		}
		count--;
	}

	@Override
	public Node get(int index) {
		Node curNode = headNode;
		while(index-- > 0) {
			curNode = curNode.getNext();
		}
		return curNode;
	}

	@Override
	public int getCount() {
		return count;
	}

	public String toString() {
		String retVal = "";
		Node curNode = headNode;
		while(curNode != null) {
			retVal += curNode.getData() + " ";
			curNode = curNode.getNext();
		}
		return retVal;
	}
}
