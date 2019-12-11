package flow_control_loops_arrays;

import java.util.Scanner;

public class Forth_Exercise {
    public static void main(String[] args) {

        Scanner naudotojas = new Scanner(System.in);

        System.out.println("Iveskite skaiciu");
        int number = naudotojas.nextInt();

        switch (number) {

            case (0):
                System.out.println("Nulis");
                break;
            case (1):
                System.out.println("Vienas");
                break;
            case (2):
                System.out.println("Du");
                break;
            case (3):
                System.out.println("Trys");
                break;
            case (4):
                System.out.println("Keturi");
                break;
            case (5):
                System.out.println("Penki");
                break;
            case (6):
                System.out.println("Sesi");
                break;
            case (7):
                System.out.println("Septyni");
                break;
            case (8):
                System.out.println("Astuoni");
                break;
            case (9):
                System.out.println("Devyni");
                break;

            default: {
                System.out.println("Ivestas klaidingas skaicius");
            }
        }
    }
}

