import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1, n2;
		double r;
		boolean error;
		
		do {
			try {
				
				error = false;
				System.out.println("Enter two numbers.  I will compute the ratio.");
				n1 = scan.nextInt();
				n2 = scan.nextInt();
				scan.nextLine();
				if (n2 == 0) throw new Exception("There was an exception: Divide by zero... Try again.");

				r = (double) n1/n2;
				
				System.out.println("The ratio r = " + r);
			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer.  Try again.");
				error = true;
				scan.nextLine();
			} catch (Exception e) {
				error = true;
				System.out.println(e.getMessage());
			}
		} while (error);
		
		scan.close();
		
	}

}
