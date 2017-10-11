package com.github.darkono1;

public class YearsToDays {
    int yearMonths[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };   //first element is not used ,indexes 1-12 are more convenient

    boolean checkLeapYear(int year) {
	boolean isLeapYear = false;   // check for leap years
	final int startYear = 1904;
	int leapingYear[] = new int[199];
	for (int j = 0; j <= 198; j += 4) {
	    if ((startYear + j) != 2100) {    // 2100 is not a leap year
		leapingYear[j] = startYear + j;
	    }
	}
	for (int j = 0; j < leapingYear.length; j++) {
	    if (leapingYear[j] == year)
		isLeapYear = true;
	}
	return isLeapYear;
    }

    int getDaysInFirstYear(int startYear, int startMonth, int startDay) {
	int daysInFirstYear = 0;
	if (checkLeapYear(startYear) && startMonth <= 2) {
	    daysInFirstYear += 1;
	}
	for (int i = startMonth; i < 12; i++) {
	    daysInFirstYear += yearMonths[i + 1];
	}
	daysInFirstYear += (yearMonths[startMonth] - startDay);
	return daysInFirstYear;
    }

    int getDaysInLastYear(int endYear, int month, int day) {
	int daysInLastYear = 0;
	if (checkLeapYear(endYear) && month > 2) {
	    daysInLastYear += 1;
	}
	for (int i = 1; i < month - 1; i++) {
	    daysInLastYear += yearMonths[i];
	}
	daysInLastYear += (yearMonths[month - 1] + day);
	return daysInLastYear;
    }

    int getDaysBetweenFirstAndLastYear(int startYear, int endYear) {
	int daysBetweenFirstAndLastYear = 0;
	for (int checkYear = startYear + 1; checkYear <= endYear - 1; checkYear++) {
	    if (checkLeapYear(checkYear)) {
		daysBetweenFirstAndLastYear += 366;   // adds one more day for leap years
	    } else {
		daysBetweenFirstAndLastYear += 365;
	    }
	}
	return daysBetweenFirstAndLastYear;
    }
}
