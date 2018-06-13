package com.exception.controller;
import java.util.*;
import com.exception.UserDefinedException.*;
import com.exception.utlities.CheckingStudentAccount;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your College ID : ");
		int id =sc.nextInt();
		CheckingStudentAccount csa = new CheckingStudentAccount(id);
		System.out.println("Enter amount of fee you want to deposit : ");
		double fee=sc.nextDouble();
		csa.feeDeposit(fee);
		try {
			csa.admitCardIssue();
			
		} catch(FeeException fe) {
			System.out.println("Admit card not issued as you are short of rs "+fe.getFee()+" from minimum fee required to issue admit card i.e rs 93500");
			
		} finally {
			sc.close();
		}
		
	}

}
