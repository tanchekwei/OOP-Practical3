/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3q1;

/**
 *
 * @author Tan Chek Wei
 * @ID 1602116
 * @DCO2 DD4
 * 
 */
import java.util.Scanner;

public class p3q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        int numberOfScores = scanner.nextInt();

        int[] score = new int[numberOfScores];
        int sum = 0;

        System.out.print("\n");
        for (int i = 0; i < numberOfScores; i++) {
            System.out.printf("Score %d: ", i + 1);
            score[i] = scanner.nextInt();
            sum += score[i];
        }

        double average = (double) sum / (double) numberOfScores;
        
        int aboveAverage = 0, belowAverage = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if(score[i] >= average){
                aboveAverage++;
            }
            else{
                belowAverage++;
            }
        }
        
        System.out.println("\nResults");
        System.out.println("=======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + aboveAverage);
        System.out.println("Number of scores below the average is " + belowAverage);
    }
}
