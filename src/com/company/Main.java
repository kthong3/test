package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfRows = 12;
        int numberOfStars = numberOfRows;
        for (int count = 0; count < numberOfRows; count++) {
            drawRowOfLength(count+1);
        }
    }

    private static void drawRowOfLength(int numberOfStars) {
        for (int count = 0; count < numberOfStars; count++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
