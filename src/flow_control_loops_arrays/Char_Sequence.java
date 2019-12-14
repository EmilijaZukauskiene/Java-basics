package flow_control_loops_arrays;

import java.util.Random;

public class Char_Sequence {

        public static void main(String[] args) {

            Random random = new Random();

            int randomNumberSize = random.nextInt(50);

            int maxNumberLength = 0;

            String maxNumber = "";

            for (int i = 0; i < randomNumberSize; i++) {

                String number = randomStringGenerator();

                System.out.println(number);

                if (number.length() > maxNumberLength) {

                    maxNumberLength = number.length();

                    maxNumber = number;
                }
            }
            System.out.println(" ");

            System.out.println("Ilgiausia sugeneruota eilute yra : " + maxNumber);

            System.out.println("Eilutes ilgis yra : " + maxNumberLength);
        }

        private static char randomCharGenerator() {

            Random random1 = new Random();

            char randomizedChar = (char) (random1.ints(1, 65, 89)).toArray()[0];

            return randomizedChar;
        }

        private static String randomStringGenerator() {

            Random random2 = new Random();

            StringBuilder randomNumber = new StringBuilder();

            int randomNumberLength = random2.nextInt(50);

            for (int i = 0; i < randomNumberLength; i++) {

                randomNumber.append(randomCharGenerator());
            }
            return randomNumber.toString();
        }
}
