package hw1.ui;

import java.util.ArrayList;
import java.util.Scanner;

import hw1.business.Action;
import hw1.business.Comedy;
import hw1.business.Drama;
import hw1.business.Movie;
import hw1.business.Rental;

public class MovieApp extends Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Movie Lister");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		String userChoice = "y";
		
		ArrayList<Rental> rentals = new ArrayList<>();
		
		while(userChoice.equalsIgnoreCase("y")) {
			System.out.print("Rent a movie. What is the genre? ");
			String genre = sc.nextLine();
			System.out.println();
			System.out.print("What is the title? ");
			String movieTitle = sc.nextLine();
			System.out.println();
			System.out.print("What is the MPAA Rating? ");
			String mpaa = sc.nextLine();
			System.out.println();
			System.out.print("What is the Movie ID Number? ");
			int movieNumber = sd.nextInt();
			System.out.println();
			System.out.print("What is their Customer ID Number? ");
			int customerNumber = sd.nextInt();
			System.out.println();
			System.out.print("How many days late? ");
			int daysLate = sd.nextInt();
			System.out.println();
	
			if (genre.equalsIgnoreCase("action")) {
				Action newMovie = new Action();
				newMovie.setTitle(movieTitle);
				newMovie.setMpaaRating(mpaa);
				newMovie.setMovieID(movieNumber);
				newMovie.setDaysLate(daysLate);
				System.out.println(newMovie.getDisplayText());
				
				Rental newRental = new Rental();
				newRental.setRentedMovie(newMovie);
				newRental.setCustomerID(customerNumber);
				newRental.setDaysLate(daysLate);
				newRental.calculatedLateFees();
				rentals.add(newRental);
				
			} else if (genre.equalsIgnoreCase("drama")) {
				Drama newMovie = new Drama();
				newMovie.setTitle(movieTitle);
				newMovie.setMpaaRating(mpaa);
				newMovie.setMovieID(movieNumber);
				newMovie.setDaysLate(daysLate);
				System.out.println(newMovie.getDisplayText());
				
				Rental newRental = new Rental();
				newRental.setRentedMovie(newMovie);
				newRental.setCustomerID(customerNumber);
				newRental.setDaysLate(daysLate);
				newRental.calculatedLateFees();
				rentals.add(newRental);
				
			} else {
				Comedy newMovie = new Comedy();
				newMovie.setTitle(movieTitle);
				newMovie.setMpaaRating(mpaa);
				newMovie.setMovieID(movieNumber);
				newMovie.setDaysLate(daysLate);
				System.out.println(newMovie.getDisplayText());
				
				Rental newRental = new Rental();
				newRental.setRentedMovie(newMovie);
				newRental.setCustomerID(customerNumber);
				newRental.setDaysLate(daysLate);
				newRental.calculatedLateFees();
				rentals.add(newRental);
				
			}
			
			System.out.println();
			System.out.print("Continue? (y/n): ");
			userChoice = sc.nextLine();
			System.out.println();
		}
		
		System.out.println("Customer Owes a total of " + Double.toString(lateFeesOwed(rentals)) + " dollars.");
		System.out.println("Ok bye!");
		sc.close();
		sd.close();
	}
	
	public static double lateFeesOwed(ArrayList<Rental> rentals) {
		Double totalLateFee = 0.0;
		for(Rental individualRental : rentals) {
			totalLateFee += individualRental.calculatedLateFees();
		}
		return totalLateFee;
	}
	
	

}
