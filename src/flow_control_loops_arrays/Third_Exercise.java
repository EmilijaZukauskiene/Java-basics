package flow_control_loops_arrays;

import java.util.Scanner;

public class Third_Exercise {
    public static void main (String [] args) {
        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int number1 = numberScanner.nextInt();

        if (number1 > 30) {
            System.out.println("Skaicius yra didesnis uz 30");
        }
        if (number1 < 30) {
            System.out.println("Skaicius yra mazesnis uz 30");
        }
        if (number1==0) {
            System.out.println("Skaicius lygus 30");
        }
    }
}
