package hw1.business;

public class Rental extends Movie{
	private int customerID;
	private int daysLate;
	private Movie rentedMovie;
	
	public Rental() {
		this.customerID = customerID;
		this.daysLate = daysLate;
		this.rentedMovie = rentedMovie;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public int getDaysLate() {
		return daysLate;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}
	
	public Movie getRentedMovie() {
		return rentedMovie;
	}

	public void setRentedMovie(Movie rentedMovie) {
		this.rentedMovie = rentedMovie;
	}
	
	@Override
	public double calculatedLateFees() {
		double lateFeeTotal = daysLate * rentedMovie.getLateFee();
		return lateFeeTotal;
	}
	
	public String getDisplayText() {
		String lateFeeTotalNew = Double.toString(calculatedLateFees());
		return super.toString() + "\n" + "Late Fee Owed: " + lateFeeTotalNew;
	}

}
