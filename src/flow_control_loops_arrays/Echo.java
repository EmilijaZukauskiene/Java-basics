package flow_control_loops_arrays;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {

        Scanner textScanner = new Scanner(System.in);

        boolean tekstas = true;

        String text;
        String reverseText = "";

        while (tekstas) {

            System.out.println("Iveskite teksta");
            text = textScanner.nextLine();

            for (int i = text.length() - 1; i >= 0; i--) {
                reverseText += text.charAt(i);
            }
            System.out.println(reverseText);

            System.out.println("");
            System.out.println("Jei norite testi dar karta iveskite: TAIP, kitu atveju NE");
            String userAnswer = textScanner.nextLine();

            if (userAnswer.equalsIgnoreCase("NE")) {
                tekstas = false;
                System.out.println("Viso gero!");
            }
        }
    }
}
