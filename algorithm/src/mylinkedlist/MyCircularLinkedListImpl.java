package mylinkedlist;

public class MyCircularLinkedListImpl implements MyLinkedList {
	private Node headNode;
	private int count;
	@Override
	public void insert(Object data, int index) {
		if(index < 0) {
			System.out.println("insert error");
			return;
		}
		if(count < 2) {
			
		}
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node get(int index) {
		if(index < 0) {
			System.out.println("GET Error.");
			return null;
		}
		if(count < 2) {
			return headNode;
		}
		int i = index % count;
		Node curNode = headNode;
		while(i-- > 0) {
			curNode = curNode.getNext();
		}
		return curNode;
	}

	@Override
	public int getCount() {
		return count;
	}

}
