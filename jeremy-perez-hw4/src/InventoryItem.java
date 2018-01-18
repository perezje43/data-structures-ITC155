
public class InventoryItem implements Comparable {

	private String name;
	private int uniqueItemID;
	
	public InventoryItem() {
		name = "";
		uniqueItemID = 0;
	}
	
	public InventoryItem (String name, int uniqueItemID) {
		this.name = name;
		this.uniqueItemID = uniqueItemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniqueItemID() {
		return uniqueItemID;
	}

	public void setUniqueItemID(int uniqueItemID) {
		this.uniqueItemID = uniqueItemID;
	}
	
	public int compareTo(Object b) {
		InventoryItem otherItem = (InventoryItem) b;
		if (this.uniqueItemID == otherItem.uniqueItemID ) {
			return 0;
		} else if (this.uniqueItemID < otherItem.uniqueItemID) {
			return 1;
		} else {
			return -1;
		}
		
		
		
	}
}
