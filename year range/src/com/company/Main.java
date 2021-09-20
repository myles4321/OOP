package com.company;
public class Main {
    public static void main(String[] args) {
        // Get all years divisible by 14 and 20
        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setRangeType(1);
        myFirstRange.setFirstDivisor(14);
        myFirstRange.setSecondDivisor(20);

        // Get all Leap years
        YearRange mySecondRange = new YearRange(1100, 3150);
        mySecondRange.setRangeType(2);
        mySecondRange.setFirstDivisor(4);
        mySecondRange.setSecondDivisor(4);

        // Get all Olympic years divisible by 3
        YearRange myThirdRange = new YearRange(1500, 1890);
        myThirdRange.setRangeType(3);
        myThirdRange.setFirstDivisor(3);
        myThirdRange.setSecondDivisor(4);

        System.out.println("List of all years divisible by " + myFirstRange.getFirstDivisor() + " and " +
                myFirstRange.getSecondDivisor());

        myFirstRange.printYears();

        System.out.println("List of all leap years between " + mySecondRange.getFirstYear() + " and " +
                mySecondRange.getSecondYear());

        mySecondRange.printYears();

        System.out.println("List of all Olympic years between " + myThirdRange.getFirstYear() + " and " +
                myThirdRange.getSecondYear() + " that are divisible by " + myThirdRange.getFirstDivisor());

        myThirdRange.printYears();
    }
}