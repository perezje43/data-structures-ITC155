import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class SieveDemo {
	
	public static void primeNumbers (ArrayList<Integer> unfilteredList) {
//		Iterator<Integer> iter = unfilteredList.iterator();
		
		for (int i = 0; i < unfilteredList.size() - 1; i++) {
			int divideNumber = unfilteredList.get(i);
			ListIterator<Integer> iter2 = unfilteredList.listIterator(i+1);
			int currentNumber = iter2.next();
			while (iter2.hasNext()) {
				if (currentNumber%divideNumber == 0) 
					iter2.remove();
				currentNumber = iter2.next();
			}
			System.out.print(divideNumber + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		
		int start = 2;
		int end = 101;
		while (start != end) {
			list.add(start);
			start++;
		}
		
		System.out.println("Original List: ");
		for(Integer item: list) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Filtered List: ");
		primeNumbers(list);
		
	}
	
}
