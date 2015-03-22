package mylinkedlist;

public interface MyLinkedList {
	public void insert(Object data, int index);
	public void delete(int index);
	public Node get(int index);
	public int getCount();
	public String toString();
}
