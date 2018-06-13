package com.exception.UserDefinedException;

public class FeeException extends Exception {
	private double fee;
	public FeeException(double fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
}
