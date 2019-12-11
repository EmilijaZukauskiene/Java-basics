package flow_control_loops_arrays;

import java.util.Scanner;

public class Devide_By {
    public static void main(String[] args) {

        double rezult;

        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        boolean count = true;

        do {
            System.out.println("Iveskite pirma skaiciu");
            double firstnum = num1.nextDouble();

            System.out.println("Iveskite antra skaiciu");
            double secondnum = num2.nextDouble();

            if ((firstnum==0) || (secondnum==0)) {
                count = false;
            }
            if ((firstnum!=0) & (secondnum!=0)) {
                rezult = firstnum/secondnum;
                System.out.printf("%.2f", rezult);
            }
        }while (count);
    }
}
