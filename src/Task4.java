import java.util.Random;
import java.util.Scanner;
//        В двумерном массиве целых чисел посчитать сумму элементов: в каждой строке; в каждом столбце;
//        одновременно по всем строкам и всем столбцам. Оформить следующим образом:
//        3   5    6    7  |  21
//        12  1    1    1  |  15
//        0   7    12   1  |  20
//        ---------------------
//        15  13  19   9  |  56
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Введите высоту и длину массива: ");
        int height = sc.nextInt();
        int length = sc.nextInt();
        int sum = 0;
        int sum1 =0;
        int[][]array = new int[height+2][length+2];
        for (int i = 0; i < array.length; i++) {
            if (i==(array.length-2)) {
                for (int j = 0; j < array[i].length; j++) System.out.print("--");
            }
            else if (i==(array.length-1)) {
                for (int j = 0; j < (array[i].length); j++) {
                    for (int k = 0; k < (array.length-2); k++) {
                        sum1+=array[k][j];
                    }
                    array[i][j]=sum1;
                    System.out.print(array[i][j]+" ");
                    sum1=0;
                }
            }
            else for (int j = 0; j < array[i].length; j++) {
                    if (j==(array[i].length-2)) System.out.print("| ");
                    else if (j==(array[i].length-1)) {
                        array[i][j]=sum;
                        System.out.print(array[i][j]);
                    }
                    else {
                        array[i][j] = rd.nextInt(9+1);
                        System.out.print(array[i][j]+"  ");
                        sum+=array[i][j];
                    }
                }
            System.out.println();
            sum=0;
        }

    }
}