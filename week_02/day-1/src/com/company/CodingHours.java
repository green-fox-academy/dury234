package com.company;

import java.text.DecimalFormat;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int dailyHours = 6;
        int semesterLengthInWeeks = 13;
        int workDaysInWeek = 5;
        int averageWorkDaysWeekly = 52;

        int hoursSpendWithCoding = dailyHours * workDaysInWeek * semesterLengthInWeeks;

        System.out.println(hoursSpendWithCoding);

        float percentageOfCoding = (float) hoursSpendWithCoding * 100 / (semesterLengthInWeeks * averageWorkDaysWeekly);

        DecimalFormat percentageFormat = new DecimalFormat("#.00");
        System.out.println(percentageFormat.format(percentageOfCoding) + " %");

    }
}
