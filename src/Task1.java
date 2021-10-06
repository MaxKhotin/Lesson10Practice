import java.util.Random;
import java.util.Scanner;

public class Task1 {
//    В одномерном массиве, состоящем из N вещественных чисел вычислить:
//• Сумму отрицательных элементов.
//• Произведение элементов с четными номерами.
//• Произведение элементов, находящихся между min и max элементами.
//• Сумму элементов, находящихся между первым и последним отрицательными
//    элементами.

    static int negativeSum  (int[] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++) {
            if (array[i]<0) sum += array[i];
        }
        return sum;
    }
    static int evenProduct (int[] array) {
        int product = 1;
        for (int i =0; i< array.length; i++) {
            if (i%2==0) product*=array[i];
        }
        return product;
    }

    static int betweenProduct (int[] array) {
        int product = 1;
        int min = array[0];
        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i =0; i< array.length; i++) {
            if (array[i]<min) {
                min=array[i];
                minIndex=i;
            }
        }
        for (int i = 0; i< array.length; i++) {
            if (array[i]>max) {
                max = array[i];
                maxIndex = i;
            }
        }
        if (minIndex<maxIndex) {
            for (int i = minIndex+1; i<maxIndex; i++) {
                product*=array[i];
            }
        }
        else {
            for (int i = maxIndex+1; i<minIndex; i++) {
                product*=array[i];
            }
        }
        return product;
    }

    static int betweenNegativeSum (int[] array) {
        int sum = 0;
        int firstNegativeIndex = 0;
        int lastNegativeIndex = 0;
        for (int i =0; i< array.length; i++) {
            if (array[i]<0) {
                firstNegativeIndex = i;
                break;
            }
        }
        for (int i = array.length-1; i>=0; i--) {
            if (array[i]<0) {
                lastNegativeIndex = i;
                break;
            }
        }
        for (int i = firstNegativeIndex+1; i<lastNegativeIndex; i++) {
            sum +=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.printf("Введите размер массива: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i< array.length; i++) {
            array[i] = rd.nextInt(100)-50;
        }
        System.out.println();
        for (int i = 0 ; i< array.length;i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Сумма отрицательных элементов: " +negativeSum(array));
        System.out.println("Произведение элементов с четными номерами: " + evenProduct(array));
        System.out.println("Произведение элементов, находящихся между min и max элементами: " + betweenProduct(array));
        System.out.println("Сумму элементов, находящихся между первым и последним отрицательными элементами: " + betweenNegativeSum(array));
    }
}
