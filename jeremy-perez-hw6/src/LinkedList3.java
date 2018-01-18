

public class LinkedList3<T extends Comparable> {
	
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
	
//	Add a node at the start of the list with the specified data
//	The added node will be the first node of the list.
	
	public void addToStart(T itemData) {
		head = new Node<T>(itemData, head);
	}
	
	
    public void addSorted(T item) {
	    if(head == null) {
	    	head = new Node<T>(item, head);
	    } else { 
	    	Node<T> current = head;
	    	Node<T> previous = null;
	    	T itemAtPosition;
	    	while(current != null) {
	    		itemAtPosition = current.data;
	    		if (item.compareTo(itemAtPosition) <= 0) {
	    			if (previous == null) { 
						head = new Node<T>(item, head);
						break;
					} else { 
						Node<T> newNode =
							new Node<T>(item, previous.link);
						previous.link = newNode;
						break;
					}
	    		}
	    		previous = current;
				current = current.link;
	    	}
	    	if (current == null) {
				Node<T> newNode = new Node<T>(item, null);
				previous.link = newNode;
	    	}
	    }
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
