
public class LinkedList3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList3<Entry> list = new LinkedList3<Entry>();
		
		Entry entry1 = new Entry("Apple", 1);
		list.addToStart(entry1);
		Entry entry2 = new Entry("Bananas", 2);
		list.addToStart(entry2);		
		Entry entry3 = new Entry("Cantaloupe", 3);
		list.addToStart(entry3);
		
		System.out.println("List has: " + list.size() + " nodes.");
		
		list.outputList();
		System.out.println();
		System.out.println("The middle node is " + list.middleNode());
		System.out.println();
		System.out.println("End of list.");
	}

}
