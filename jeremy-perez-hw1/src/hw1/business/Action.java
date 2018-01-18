package hw1.business;

public class Action extends Movie{
	private int daysLate;
	private double lateFee;
	
	public Action() {
		daysLate = 0;
		lateFee = 3.0;
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
