import java.util.Date;

public class RatingStats {
	private int ratingsCount;
	private double ratingsSum;
	
	public RatingStats(double ratingNumber) {
		ratingsCount = 1;
		ratingsSum = ratingNumber;
	}
	
	public RatingStats (RatingStats originalObject) {
		ratingsSum = originalObject.ratingsSum;
		ratingsCount = originalObject.ratingsCount;
	}
//
	public void addRatingsCount() {
		ratingsCount++;
	}
	public double getRatingsSum() {
		return ratingsSum;
	}
//	
	public int getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public double addRatingsSum(double anotherRating) {
		return ratingsSum += anotherRating;
	}

	public void setRatingsSum(double ratingsSum) {
		this.ratingsSum = ratingsSum;
	}	
	
	@Override
	public String toString () {
		return (ratingsCount + " reviews, average of " + ratingsSum / ratingsCount + " / 5.");
	}
	
}
