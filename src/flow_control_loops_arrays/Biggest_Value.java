package flow_control_loops_arrays;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Random;

public class Biggest_Value {

    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = random.nextInt(Integer.MAX_VALUE);
        int[] mas = new int[5];



        for (int i = 0; i < mas.length; i++) {
            mas[i] = getRandomNumberInRange(maxValue);
            System.out.println(mas[i]);
        }

        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i]) {
                max = mas[i];
                System.out.println("Didziausias skaicius yra:" + max);
            }
        }
    }
    private static int getRandomNumberInRange(int max) {
        Random r = new Random();
        return r.nextInt(max + 1);
    }
}