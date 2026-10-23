package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {75, 77, 79, 80, 85, 87, 89, 91, 98, 99};
        System.out.println("The average score is " + average(testScores));
    }

    public static double average(int[] testScores) {
        double total = 0;
        for (int score : testScores) {
            total += score;
        }
        return total / testScores.length;
    }
}
