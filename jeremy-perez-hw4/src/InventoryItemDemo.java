
public class InventoryItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InventoryItem[] d = new InventoryItem[3];
		 
		d[0] = new InventoryItem("Spiderman Suit", 21);
		d[1] = new InventoryItem("Power Ring", 59);
		d[2] = new InventoryItem("Bulletproof Bracelets", 3);

		System.out.println("Before sorting: ");
		int i;
		
		for (i = 0; i < d.length; i++) {
			System.out.println("ID: " + d[i].getUniqueItemID() + ", " + "Name: " + d[i].getName());
		}
		
		System.out.println();
		
		GeneralizedSelectionSort.sort(d, d.length);
		
		System.out.println("After sorting: ");
		
		for (i = 0; i <d.length; i++) 
			System.out.println("ID: " + d[i].getUniqueItemID() + ", " + "Name: " + d[i].getName());
	}

}
