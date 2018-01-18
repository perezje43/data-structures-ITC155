
public class LinkedList3Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList3<Entry> list = new LinkedList3<Entry>();
		
		Entry entry1 = new Entry("Apple", 1);
		list.addToStart(entry1);
		Entry entry2 = new Entry("Banana", 2);
		list.addSorted(entry2);		
		Entry entry3 = new Entry("Cantaloupe", 3);
		list.addSorted(entry3);
		Entry entry4 = new Entry("Apricot", 4);
		list.addSorted(entry4);
		System.out.println("List has: " + list.size() + " nodes.");
		list.outputList();
		System.out.println("End of list.");
	}

}
