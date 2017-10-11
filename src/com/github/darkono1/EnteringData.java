package com.github.darkono1;

import java.util.Scanner;

public class EnteringData {

    int dayInFirstYear, monthInFirstYear, firstYear, dayInLastYear,
    monthInLastYear, lastYear;
    boolean isInteger, dayIsInRange, monthIsInRange, yearIsInRange;
    String inputValue = "";
    Scanner inputVar = new Scanner(System.in);
    CheckInput checkVar = new CheckInput();

    int enterDaysOfMonth() {
	do {
	    System.out.println("Enter day in a month");
	    inputValue = inputVar.nextLine();
	    isInteger = checkVar.checkInteger(inputValue);
	    dayIsInRange = checkVar.checkDayRange();
	} while (!(isInteger && dayIsInRange));
	dayInFirstYear = Integer.parseInt(inputValue);
	return dayInFirstYear;
    }

    int enterMonthsOfYear() {
	do {
	    System.out.println("Enter month of the year , use number.");
	    inputValue = inputVar.nextLine();
	    isInteger = checkVar.checkInteger(inputValue);
	    monthIsInRange = checkVar.checkMonthRange();
	} while (!(isInteger && monthIsInRange));
	monthInFirstYear = Integer.parseInt(inputValue);
	return monthInFirstYear;
    }

    int enterYear() {
	do {
	    System.out.println("Enter year , from year 1901. to year 2100.");
	    inputValue = inputVar.nextLine();
	    isInteger = checkVar.checkInteger(inputValue);
	    yearIsInRange = checkVar.checkYearRange();
	} while (!(isInteger && yearIsInRange));
	firstYear = Integer.parseInt(inputValue);
	return firstYear;
    }
}
