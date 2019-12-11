package basics;
import java.util.Scanner;

public class SecondExercise {
    public static void main (String [] args){

        Scanner numberScannenr = new Scanner(System.in);

        System.out.println("Iveskite pirmini skaiciu");

        double number = numberScannenr.nextDouble();

        System.out.printf("%.2f", number);
    }
}