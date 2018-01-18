
public class Entry {

	private String item;
	private int count;
	
	public Entry(String itemData, int countData) {
		item = itemData;
		count = countData;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return(item + " " + count);
	}
	

	@Override
	public boolean equals (Object otherObject) {
		if(otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Entry otherEntry = (Entry) otherObject;
			return (item.equals(otherEntry.item) && (count == otherEntry.count));
		}
	}

}
