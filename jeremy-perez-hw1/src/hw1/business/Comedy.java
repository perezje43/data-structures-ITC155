package hw1.business;

public class Comedy extends Movie {
	private int daysLate;
	private double lateFee;

	public Comedy() {
		daysLate = 0;
		lateFee = 2.5;
	}
	
	public int getDaysLate() {
		return daysLate;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}

	public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}
	
	@Override
	public double calculatedLateFees() {
		double lateFeeTotal = daysLate * lateFee;
		return lateFeeTotal;
	}
	
	public String getDisplayText() {
		String lateFeeTotalNew = Double.toString(calculatedLateFees());
		return super.toString() + "\n" + "Late Fee Owed: " + lateFeeTotalNew;
	}
}
