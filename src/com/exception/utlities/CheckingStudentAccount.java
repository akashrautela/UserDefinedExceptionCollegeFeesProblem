package com.exception.utlities;
import com.exception.UserDefinedException.*;

public class CheckingStudentAccount {
	private double fee;
	private int collegeId;
	public CheckingStudentAccount(int collegeId) {
		this.collegeId=collegeId;
	}
	public void feeDeposit(double amnt) {
		fee=amnt;
	}
	public void admitCardIssue() throws FeeException {
		if(fee >= 94500)
			System.out.println("Admit card issued");
		else if(fee < 93500) {
			double needs = 93500-fee;
			throw new FeeException(needs);
		}
	}
	public double getDepositedFee() {
		return fee;
	}
	public int getCollegeId() {
		return collegeId;
	}

}
