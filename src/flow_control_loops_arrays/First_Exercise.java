package flow_control_loops_arrays;

import java.util.Scanner;

public class First_Exercise {
    public static void main (String [] args){

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int number = numberScanner.nextInt();

        if (number>30){
            System.out.println("Skaicius yra didesnis uz 30");
        } if (number<30){
            System.out.println("Skaicius yra mazesnis uz 30");
        } else {
            System.out.println("Skaicius lygus 30");
        }
    }
}
