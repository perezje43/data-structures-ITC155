public class HugeNumber {
	
	private class DigitNode {
		private int aNumber;
		private DigitNode link;
		
		public DigitNode() {
			aNumber = 0;
			link = null;
		}
		
		public DigitNode(int differentNumber, DigitNode linkValue) {
			 aNumber = differentNumber;
			 link = linkValue;
		}
	}
	
	private DigitNode head;
	
	public HugeNumber() {
		head = null;
	}
	
	public void addDigit (String newNumber) {
		for(int i = 0; i < newNumber.length(); i++) {
			head = new DigitNode(Character.getNumericValue(newNumber.charAt(i)), head);
		}

	}
	
	public void outputList() {
		if(head != null) {
			DigitNode position = head;
			String returnDigit = "";
			while(position != null) {
				returnDigit = Integer.toString(position.aNumber) + returnDigit;
				position = position.link;
			}
			System.out.println(returnDigit);
		} else
			System.out.println("Empty List");
	}
	
	public void resetDigit() {
		head = null;
	}
	
	
}
