package flow_control_loops_arrays;

import java.util.Scanner;

public class Shoping {

    private static final double MILK_PRICE = 1.45;
    private static final double WINE_PRICE = 15.50;
    private static final double LEIST_AMZIUS = 21;

    public static void main(String[] args) {


        Scanner pirkejas = new Scanner(System.in);
        Scanner milkPriceScanner = new Scanner(System.in);
        Scanner winePriceScanner = new Scanner(System.in);
        Scanner ageScanner = new Scanner(System.in);

        System.out.println("Laba diena. Jums paduoti piena ar vyno?");
        String preke = pirkejas.nextLine();

        switch (preke) {
            case ("Pieno"): {
                System.out.println("Iveskite suma kuria mokate uz piena : ");
                double milkPrice = milkPriceScanner.nextDouble();
                if (milkPrice > MILK_PRICE) {
                    System.out.println("Stai Jusu graza " + (milkPrice - MILK_PRICE));
                } else {
                    if (milkPrice < MILK_PRICE) {
                        System.out.println("Jusu trukstama suma yra" + (MILK_PRICE - milkPrice));
                    } else {
                        System.out.println("Grazios dienos!");
                    }
                }
                break;
            }

            case ("Vyno"): {
                System.out.println("Koks Jusu amzius : ");
                int age = ageScanner.nextInt();

                System.out.println(" ");
                System.out.println(" ");

                if (age < LEIST_AMZIUS) {
                    System.out.println("Jus esate per jaunas");
                    System.out.println(" ");
                } else {
                    System.out.println("Iveskite suma kuria mokate uz vyna : ");
                    double winePrice = winePriceScanner.nextDouble();

                    System.out.println("Prasome");
                    if (winePrice > WINE_PRICE) {
                        System.out.println("Jusu graza" + (winePrice - WINE_PRICE));
                    } else {
                        if (winePrice < WINE_PRICE) {
                            System.out.println("Jusu trukstama suma yra" + (MILK_PRICE - winePrice));
                        } else {
                            System.out.println("Grazios dienos!");
                        }
                    }
                }
                break;
            }
        }
    }
}