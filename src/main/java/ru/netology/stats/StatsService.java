package ru.netology.stats;

public class StatsService {

    public int findSum(int[] massiv) {
        int currentSum = 0;
        for (int currentValue : massiv) {
            currentSum += currentValue;
        }
        return currentSum;
    }

    public int findAvgSum(int[] massiv) {
        int currentSum = 0;
        for (int currentValue : massiv) {
            currentSum += currentValue;
        }
        return currentSum / massiv.length;
    }

    public int findMaxMonth(int[] massiv) {
        int currentMonth = 0;
        int currentValue = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (currentValue <= massiv[i]) {
                currentMonth = i;
                currentValue = massiv[i];
            }
        }
        return currentMonth + 1;
    }

    public int findMinMonth(int[] massiv) {
        int currentMonth = 0;
        int currentValue = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (currentValue >= massiv[i]) {
                currentMonth = i;
                currentValue = massiv[i];
            }
        }
        return currentMonth + 1;
    }

    public int findLessAvgSum(int[] massiv) {
        int counter = 0;
        int avgSum = findAvgSum(massiv);
        for (int currentVallue : massiv) {
            if (currentVallue < avgSum) counter++;
        }
        return counter;
    }

    public int findMoreAvgSum(int[] massiv) {
        int counter = 0;
        int avgSum = findAvgSum(massiv);
        for (int currentVallue : massiv) {
            if (currentVallue > avgSum) counter++;
        }
        return counter;
    }
}
