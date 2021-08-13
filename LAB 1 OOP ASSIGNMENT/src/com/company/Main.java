package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int kcse_grades, interview_score, confidence_score;

	System.out.println("\nUNIVERSITY ADMISSION PORTAL");
	System.out.println("INPUT");
        System.out.print("KCSE Grades: ");
        kcse_grades = input.nextInt();

        System.out.print ("INTERVIEW QUESTIONS SCORE: ");
        interview_score = input.nextInt();

        System.out.print("CONFIDENCE LEVEL SCORES: ");
                confidence_score = input.nextInt();

                if (kcse_grades >= 65) {
                    if((interview_score >=6) || (confidence_score>=5))
                    {
                        System.out.println("\nSTUDENT SCORES ARE: ");
                        System.out.println("\nKCSE GRADES: " +kcse_grades);
                        System.out.println("INTERVIEW QUESTIONS SCORE: " +interview_score);
                        System.out.println("CONFIDENCE LEVEL SCORE: " +confidence_score);

                        System.out.println("\nCONGRATULATIONS! STUDENT HAS BEEN ADMITTED INTO THE UNIVERSITY.");

                    }
                    else{
                        System.out.print("\nStudent scores are: ");
                        System.out.println("KCSE GRADES: " +kcse_grades);
                        System.out.println("INTERVIEW QUESTIONS SCORE: " +interview_score);
                        System.out.println("CONFIDENCE LEVEL SCORE: " +confidence_score);

                        System.out.println("\nSORRY STUDENT HAS BEEN REJECTED AS MINIMUM REQUIREMENTS WAS NOT REACHED.");
                    }
                }
                else{
                    System.out.print("\nStudent scores are: ");
                    System.out.println("KCSE GRADES: " +kcse_grades);
                    System.out.println("INTERVIEW QUESTIONS SCORE: " +interview_score);
                    System.out.println("CONFIDENCE LEVEL SCORE: " +confidence_score);

                    System.out.println("\nSORRY STUDENT HAS BEEN REJECTED AS MINIMUM REQUIREMENTS WAS NOT REACHED.");
                }

    }
}
