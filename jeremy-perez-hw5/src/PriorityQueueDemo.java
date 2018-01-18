import java.util.ArrayList;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program creates a list where every item added to the queue also has an associated priority.");
		
		PriorityQueue<String> newQueue = new PriorityQueue<String>();
		
		newQueue.add("X", 10);
		newQueue.add("Y", 1);
		newQueue.add("Z", 3);
		
		System.out.println(newQueue.remove());
		System.out.println(newQueue.remove());
		System.out.println(newQueue.remove());


	}
}
