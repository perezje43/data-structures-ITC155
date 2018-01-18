
public class LinkedList3<T> {
	
	private static class Node<T> {
		private T data;
		private Node<T> link;
		
		public Node() {
			data = null;
			link = null;
		}
		
		public Node(T newData, Node<T> linkValue) {
			data = newData;
			link = linkValue;
		}
		
	}

	private Node<T> head;
	
	public LinkedList3() {
		head = null;
	}
	
	public T middleNode() {

		Node<T> halfNode, trackerNode; 
		halfNode = head;
		trackerNode = head; 
	 
		while(trackerNode != null) { 
			trackerNode = trackerNode.link; 
			if(trackerNode != null && trackerNode.link != null) { 
				halfNode = halfNode.link; 
				trackerNode = trackerNode.link; 
			}
		} 
		return halfNode.data;
	}
	
//	Add a node at the start of the list with the specified data
//	The added node will be the first node of the list.
	
	public void addToStart(T itemData) {
		head = new Node<T>(itemData, head);
	}
	
//	Remove the head node and return true if the list contains
//	at least one node. Return false if the list is empty.
	
	public boolean deleteHeadNode() {
		if (head != null) {
			head = head.link;
			return true;
		} else 
			return false;
	}
	
	public int size() {
		int count = 0;
		Node<T> position = head;
		while(position != null) {
			count++;
			position = position.link;
		}
		return count;
	}
	
	private Node<T> find (T target) {
		Node<T> position = head;
		T itemAtPosition;
		
		while(position != null) {
			itemAtPosition = position.data;
			if(itemAtPosition.equals(target))
				return position;
			position = position.link;
		}
		return null;
	}
	
//	Find the first node containing the target and return 
//	a reference to the data in that node, or null if not found
	
	public T findData(T target) {
		
		return find(target).data;
		
	}
	
	public void outputList() {
		Node<T> position = head;
		while(position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void clear() {
		head = null;
	}
	
//	For two lists to be equal must contain some data item in the 
//	same orders. Will use the equals method of T to compare.

	public boolean equals(Object otherObject) {
		
		if(otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			LinkedList3<T> otherList = (LinkedList3<T>) otherObject;
			if (size() != otherList.size())
				return false;
			Node<T> position = head;
			Node<T> otherPosition = otherList.head;
			while (position != null) {
				if (!(position.data.equals(otherPosition.data)))
					return false;
				position = position.link;
				otherPosition = otherPosition.link;
			}
			return true; //no mismatch was found.
		}
	}
}
