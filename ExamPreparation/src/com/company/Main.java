package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int permitedBadGrades = scan.nextInt();
        scan.nextLine();
        String exerciseName = scan.nextLine();
        int gradeExercise = scan.nextInt();

        int countBadGrades = 0;
        int countGrades = 0;
        int sumGrades = 0;
        int allExercises = 0;
        String lastExercise = "";

        while(true){
            countGrades++;
            sumGrades += gradeExercise;
            allExercises ++;

            if (gradeExercise <= 4){
                countBadGrades++;
            }
            if (countBadGrades == permitedBadGrades){
                System.out.printf("You need a break, %d poor grades.", countBadGrades);
                break;
            }
            lastExercise = exerciseName;
            scan.nextLine();
            exerciseName = scan.nextLine();
            if(exerciseName.equals("Enough")){
                break;
            }
            gradeExercise = scan.nextInt();
        }

        if (exerciseName.equals("Enough")){
            System.out.printf("Average score: %.2f %n", (double)sumGrades / (double)countGrades );
            System.out.printf("Number of problems: %d %n", allExercises);
            System.out.printf("Last problem: %s", lastExercise);
        }

    }
}
