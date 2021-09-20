package com.company;

public class YearRange {
    private int firstDivisor;
    private int secondDivisor;
    private int RangeType;
    private int firstYear;
    private int secondYear;

    public YearRange (int FirstYear, int SecondYear) {
        this.firstYear = FirstYear;
        this.secondYear = SecondYear;
    }

    public void setRangeType(int rangeType) {
        RangeType = rangeType;
    }
    public int getRangeType() {
        return RangeType;
    }
    public void setFirstDivisor(int FirstDivisor) {
        firstDivisor = FirstDivisor;
    }
    public int getFirstDivisor() {
        return firstDivisor;
    }
    public void setSecondDivisor(int SecondDivisor) {
        secondDivisor = SecondDivisor;
    }
    public int getSecondDivisor() {
        return secondDivisor;
    }
    public void setFirstYear(int FirstYear) {
        firstYear = FirstYear;
    }
    public int getFirstYear(){
        return firstYear;
    }
    public void setSecondYear(int SecondYear) {
        secondYear = SecondYear;
    }
    public int getSecondYear(){
        return secondYear;
    }
    public void printYears() {
        while (firstYear <= secondYear) {
            firstYear++;
            if (firstYear % firstDivisor == 0 && firstYear % secondDivisor == 0) {
                System.out.println(firstYear);
            }
        }
    }
}
