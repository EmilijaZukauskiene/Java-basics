package flow_control_loops_arrays;

import java.util.Scanner;

public class Second_Exercise {
    public static void main(String[] args) {

        Scanner numberScanner = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu");
        int number1 = numberScanner.nextInt();
        System.out.println("Iveskite antra skaiciu");
        int number2 = numberScanner.nextInt();

        if (number1 > 30) {
            System.out.println("Pirmas skaicius yra didesnis uz 30");
        }
        if (number1 < 30) {
            System.out.println("Pirmas skaicius yra mazesnis uz 30");
        } else {
            System.out.println("Pirmas skaicius lygus 30");
        }

        if (number2 > 30) {
            System.out.println("Antras skaicius yra didesnis uz 30");
        }
        if (number2 < 30) {
            System.out.println("Antras skaicius yra mazesnis uz 30");
        } else {
            System.out.println("Antras Skaicius lygus 30");
        }
    }
}
