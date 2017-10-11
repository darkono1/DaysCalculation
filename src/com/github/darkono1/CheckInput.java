package com.github.darkono1;

public class CheckInput {
    private int inputNumber;

    boolean checkInteger(String checkValue) {

	boolean isInteger;
	try {
	    inputNumber = Integer.parseInt(checkValue);  /*inputNumber is passed with every integer*/ 
	    isInteger = true;                            /* check and is used in an appropriate method*/
	} catch (Exception e) {
	    System.out.println("Wrong input:");
	    isInteger = false;
	}
	return isInteger;
    }

    boolean checkDayRange() {
	boolean dayRange;
	if (inputNumber > 0 && inputNumber <= 31) {
	    dayRange = true;
	} else {
	    dayRange = false;
	    System.out.println("Days in months are between 1 and 31");
	}
	return dayRange;
    }

    boolean checkMonthRange() {
	boolean monthRange;
	if (inputNumber > 0 && inputNumber <= 12) {
	    monthRange = true;
	} else {
	    monthRange = false;
	    System.out.println("Months in a year have value between 1 and 12.");
	}
	return monthRange;
    }

    boolean checkYearRange() {
	boolean yearRange;
	if (inputNumber >= 1901 && inputNumber <= 2100) {
	    yearRange = true;
	} else {
	    yearRange = false;
	    System.out
		    .println("This program operates in  range from year 1901. to 2100.");
	}
	return yearRange;
    }
}
