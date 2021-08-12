package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

	System.out.print("Input the first number: ");
	int number = input.nextInt();
	System.out.print("Input second number: ");
	int number2 = input.nextInt();

	int addition = number + number2;
	System.out.print("The sum of both numbers is: "+addition);


    }
}
