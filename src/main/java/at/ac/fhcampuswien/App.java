package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    // Implement all methods as public static
    public static void main(String[] args) {
        oneMonthCalendar(30, 1);
    //        // test your method implementations here
    //        // make method calls
    //        // print their results
    //        // etc.
    }
    public static void oneMonthCalendar (int numberofdays, int daybegin) {

        int day = 2 - daybegin;

        for(int i = 1; i <= numberofdays + daybegin - 1; i++){

            if(i % 7 == 1){
                System.out.println();
            }
            if(i < daybegin){
                System.out.print("   ");
            }else {
                if (day / 10 == 0){
                    System.out.print("  "+day);
                }else {
                    System.out.print(" "+day);
                }
            } day ++;
        }
    }


}