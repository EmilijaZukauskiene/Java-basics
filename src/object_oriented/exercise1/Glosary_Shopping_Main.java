package object_oriented.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Glosary_Shopping_Main {

    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product();
        products[0].setPrice(12.50);

        products[1] = new Product();
        products[1].setPrice(4.50);

        products[2] = new Product();
        products[2].setPrice(45.40);

        products[3] = new Product();
        products[3].setPrice(15.50);

        products[4] = new Product();
        products[4].setPrice(3.50);

        int product = 0;
        int number = 1;
        double sum=0;
        while (product < 5) {
            System.out.println("product" + number + " price is "+ products[product].getPrice());
            product = product + 1;
            number = product + 1;
        }
        System.out.println("Is viso Jusu krepselyje yra 5 prekes");

        for(int i=0; i<5; i++){
            sum=sum+ products[i].getPrice();
        }
        System.out.println("Prasau mokekite "+sum+" eur");
    }
}