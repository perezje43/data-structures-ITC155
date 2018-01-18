package hw1.business;

public class Drama extends Movie {
	private int daysLate;
	private double lateFee;
	
	public Drama() {
		daysLate = 0;
	}
	
	public int getDaysLate() {
		return daysLate;
	}

	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
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
