package hw1.business;

public class Movie {
	
	private String mpaaRating;
	private int movieID;
	private String title;
	private double lateFee;
	
	public Movie() {
		mpaaRating = "";
		movieID = 0;
		title = "";
		lateFee = 2.0;
	}

	public String getMpaaRating() {
		return mpaaRating;
	}

	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}
	
	public double calculatedLateFees() {
		return 0.0;
	}
	
	@Override 
	public String toString() {
		return "Title: " + title + "\n" + "MPAA Rating: " + mpaaRating + "\n" + "ID: " + movieID; 
	}
	
}
