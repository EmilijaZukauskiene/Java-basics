package flow_control_loops_arrays;

import java.util.Scanner;
public class Christmas_Tree {
    public static void main(String[] args) {

        Scanner triangleHeightScanner = new Scanner(System.in);
        System.out.println("Iveskite trikampio auksti : ");
        int triangleHeight = triangleHeightScanner.nextInt();

        Scanner rectangleWidthScanner = new Scanner(System.in);
        System.out.println("Iveskite staciakampio ploti : ");
        int rectangleWidth = rectangleWidthScanner.nextInt();

        Scanner rectangleHeightcanner = new Scanner(System.in);
        System.out.println("Iveskite staciakampio auksti  : ");
        int rectangleHeight = rectangleWidthScanner.nextInt();

        int triangleHeightMinusOne = triangleHeight - 1;

        printingTriangle(triangleHeight, triangleHeightMinusOne);

        System.out.printf("%n");

        printingRectangular(rectangleHeight, rectangleWidth);
        printingTriangle(triangleHeight, triangleHeightMinusOne);
        printingTrunk(triangleHeight);
        System.out.printf("%n");
    }

    private static int triangleWidthCalc(int triangleStage) {
        int stageWidth = 1;
        for (int i = 1; i < triangleStage; i++) {
            stageWidth = stageWidth + 2;
        }
        return stageWidth;
    }
    private static void printingSpace(int triangleHeightMinusOne) {
        for (int z = triangleHeightMinusOne; z > 0; z--) {
            System.out.print(" ");
        }
    }
    private static void printingTriangle(int triangleHeight, int triangleHeightMinusOne) {
        for (int i = 1; i < triangleHeight + 1; i++) {
            printingSpace(triangleHeightMinusOne--);
            for (int y = 0; y < triangleWidthCalc(i); y++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
    private static void printingRectangular(int rectangleHeight, int rectangleWidth) {
        for (int i = 0; i < rectangleHeight; i++) {
            for (int y = 0; y < rectangleWidth; y++) {
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }
    private static void printingTrunk(int triangleHeight) {
        int treeCenter = triangleWidthCalc(triangleHeight) / 2;
        int trunkHeight = triangleHeight / 2;
        for (int i = 0; i < trunkHeight; i++) {
            printingSpace(treeCenter);
            System.out.println("*");
        }
    }
}
