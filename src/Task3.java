import java.util.Scanner;

public class Task3 {
//    Напишите программу, которая создает двухмерный массив и заполняет его по следующему принципу:
//    пользователь вводит число (например, 3) первый элемент массива принимает значение этого числа,
//    последующий элемент массива принимает значение этого числа + 1 (т.е. 4 для нашего примера),
//    третий элемент массива предыдущий элемент + 1 (т.е. 5 для нашего примера). Созданный массив вывести на экран.

    static void createArray(int height, int length, int firstNumber) {
        int[][]array = new int[height][length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                array[i][j] =firstNumber+i*length+j;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите высоту и длину массива: ");
    int height=sc.nextInt();
    int length=sc.nextInt();
    System.out.println("Введите первое число массива: ");
    int firstNumber = sc.nextInt();
    createArray(height,length,firstNumber);
}
}
