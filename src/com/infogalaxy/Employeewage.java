package com.infogalaxy;

public class Employeewage {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Welcome to Employee Wage Computation Program");
		
		// uc-1-check attendance
		int Check_Attendance = (int)Math.floor(Math.random()*10)%2;
		if(Check_Attendance==1) {
			System.out.println("Employee is Present");
			
			double n = Math.floor(Math.random()*10)%2;
	
			if(n == 1)
			{
				System.out.println("Emplyoee Is Full time");
			} else
			{
				System.out.println("Emplyoee is Part Time");
			}
		}else {
			System.out.println("Employee is absent");
		}
		
	}
}