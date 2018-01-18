import java.util.Scanner;

public class FibonacciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			int numberInput = sc.nextInt();
			sc.close();
			if (numberInput < 0) throw new IllegalArgumentException ("n must be non-negative, good bye");

			System.out.println();
			
			for (int i = 0; i <= numberInput; i++){
				System.out.println("Fibonacci number " + i + ": " + Fibonacci(i));
			}
			
			System.out.println();
			
			if(numberInput == 1) {
				System.out.println("The " + numberInput + "st " + "Fibonacci number is " + Fibonacci(numberInput) + ".");
			} else if (numberInput == 2) {
				System.out.println("The " + numberInput + "nd " + "Fibonacci number is " + Fibonacci(numberInput) + ".");
			} else if (numberInput == 3){
				System.out.println("The " + numberInput + "rd " + "Fibonacci number is " + Fibonacci(numberInput) + ".");
			} else {
				System.out.println("The " + numberInput + "th " + "Fibonacci number is " + Fibonacci(numberInput) + ".");
			}
			
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int Fibonacci(int n) {
		int sum = 0;
		if (n == 0 || n == 1) {
			sum = 1;
		} else if (n > 1 ){
			sum += Fibonacci(n-1) + Fibonacci(n-2);
		}
		return sum;
	}

}
