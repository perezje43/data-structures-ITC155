import java.util.ArrayList;

public class PriorityQueue<T> {
	
	private ArrayList<PriorityPair> queue;
	
	public PriorityQueue () {
		queue = new ArrayList<PriorityPair>();
	}
	
	public void add(T item, int priority) {
		PriorityPair newObject = new PriorityPair(item, priority);
		queue.add(newObject);
		System.out.println("Add item: " + newObject.getItem() + " with priority: " + newObject.getPriority());
	}
	
	public String remove() {
		int largestIndex = 0;
		int largestPriority = 0;
		for (int i = 0; i < queue.size(); i++) {
			if (queue.get(i).getPriority() > largestPriority) {
				largestPriority = queue.get(i).getPriority();
				largestIndex = i;
			}
		}
		String largestItem = queue.get(largestIndex).getItem().toString();
		queue.remove(largestIndex);
		return largestItem;
	}
	

	public class PriorityPair<T> {
		
		private T item;
		private int priority;
		
		public PriorityPair(T item, int priority) {
			this.item = item;
			this.priority = priority;
		}
	
		public T getItem() {
			return item;
		}
	
		public void setItem(T item) {
			this.item = item;
		}
	
		public int getPriority() {
			return priority;
		}
	
		public void setPriority(int priority) {
			this.priority = priority;
		}
		
	}
	
}
