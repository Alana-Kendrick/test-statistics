package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {75, 77, 79, 80, 85, 87, 89, 91, 98, 99};
        System.out.println("The average score is " + average(testScores));
        System.out.println("The highest score is " + highScore(testScores));

    }

    public static double average(int[] testScores) {
        double total = 0;
        for (int score : testScores) {
            total += score;
        }
        return total / testScores.length;
    }

    public static int highScore(int[] testScores) {
        int highest = 0;
        for (int score : testScores) {
            highest = Math.max(highest, testScores[score]);
        }
        return highest;
    }
}
