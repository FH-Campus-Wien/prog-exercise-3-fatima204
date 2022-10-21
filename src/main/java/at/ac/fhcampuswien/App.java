package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        oneMonthCalendar(30, 2);
        guessingGame(0);
        int a [] = {1,2,3,4,5,6};
        int b [] = {7,8,9,10,11};
        swapArrays();
    }

    public static void oneMonthCalendar (int numberofdays, int daybegin) {

        int day = 1;

        for(int i = 1; i <= numberofdays + daybegin - 1; i++){

            if(i % 7 == 1) {
                System.out.println();
            }
            if(i < daybegin){
                System.out.print("   ");
            }else {
                if (day / 10 == 0) {
                    System.out.print("  " + day);
                } else {
                    System.out.print(" " + day);
                }
                day++;
            }
        }
    }

    public static void guessingGame (int numberToGuess) {

        int number = 1;

        while (true) {

            if (number <= 10) {

                Random random = new Random();
                numberToGuess = random.nextInt(100) + 1;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Guess number " + (number++) + ": ");
                int Playerguess = scanner.nextInt();

                if (Playerguess == numberToGuess) {
                    System.out.println("You won wisenheimer!");
                    break;
                } else if (Playerguess < numberToGuess) {
                    System.out.println("The number AI picked is higher than your guess.");
                } else if (Playerguess > numberToGuess) {
                    System.out.println("The number AI picked is lower than your guess.");
                }

            } else {
                System.out.println("You lost! Have you ever heard of divide or conquer?");
                break;
            }
        }

    }

    public static void swapArrays () {

        int i;
        int j;
        int swap;

        int a[] = {};
        int b[] = {};

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {

                swap = a[i];
                a[i] = b[j];
                b[j] = swap;

                System.out.println(a[i]);
                System.out.println(b[i]);
            }
        }
    }
    public static void checkDigit (int code){

    }
}