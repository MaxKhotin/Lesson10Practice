import java.util.Random;
import java.util.Scanner;

public class Task2 {
    //    В двумерном массиве целых числе посчитать:
//•	Сумму всех элементов массива
//•	Среднее арифметическое всех элементов массива
//•	Минимальный элемент
//•	Максимальный элемент
    static int elementSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
    static int averageFinder(int[][] array) {
        int sum = 0;
        int elementCounter =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                elementCounter += 1;
            }
        }
        return (sum/elementCounter);
    }
    static int minFinder (int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) min = array[i][j];
            }
        }
        return min;
    }

    static int maxFinder (int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array [i][j] > max) max = array[i][j];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Введите высоту и длину массива: ");
        int height = sc.nextInt();
        int length = sc.nextInt();
        int[][] array = new int[height][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(50) - 20;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива: " + elementSum(array));
        System.out.println("Среднее арифметическое всех элементов массива: " + averageFinder(array));
        System.out.println("Минимальный элемент: " + minFinder(array));
        System.out.println("Максимальный элемент: " +maxFinder(array));
    }
}
