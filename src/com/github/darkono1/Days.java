package com.github.darkono1;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
	int startYear, endYear, startMonth, startDay, endMonth, endDay;
	int sumOfAllDays;
	Scanner inputVar = new Scanner(System.in);
	YearsToDays yearsToDays = new YearsToDays();
	EnteringData enterData = new EnteringData();
	
	System.out.println("This program calculates numbers of days between someone's birthday "+"\n"
		+ "and a second date you enter, earliest date is in year 1901., "+"\n" 
		+ "second date is up to year 2100. ,birthday year must have lower value than second year.");
	startDay = enterData.enterDaysOfMonth();
	startMonth = enterData.enterMonthsOfYear();
	startYear = enterData.enterYear();
	endDay = enterData.enterDaysOfMonth();
	endMonth = enterData.enterMonthsOfYear();
	do {
	    endYear = enterData.enterYear();
	    if (endYear < startYear) {
		System.out.println("Birthday year must have lower value "
			+ "\n" + "than year to which days are calculated.");
	    }
	}while(endYear<startYear);
	sumOfAllDays = +(yearsToDays.getDaysInLastYear(endYear, endMonth, endDay)   /*calls three methods ,first for days in first year*/
		+ yearsToDays.getDaysInFirstYear(startYear, startMonth, startDay)   /*second for days in last year, third for days in years between*/
		+ yearsToDays.getDaysBetweenFirstAndLastYear(startYear, endYear));
	System.out.println("Sum of all days from date:" + startDay + "."
		+ startMonth + "." + startYear + "." + " to date:" + endDay
		+ "." + endMonth + "." + endYear + ". is " + sumOfAllDays);
	inputVar.close();
    }
}
