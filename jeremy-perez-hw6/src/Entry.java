
public class Entry implements Comparable {
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
    public int compareTo(Object otherObject) throws ClassCastException {
        if (otherObject == null) {
            throw new ClassCastException("An Entry object expected.");
        } else if (getClass() != otherObject.getClass()) {
            throw new ClassCastException("An Entry object expected.");
        } else {
            Entry otherEntry = (Entry) otherObject;
            return (item.compareTo(otherEntry.item));
        }
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
