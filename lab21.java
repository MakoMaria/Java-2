//Пользователь вводит с клавиатуры целое
//неотрицательное число n (n<15). С помощью
//циклов for и while посчитать факториал n! и вывести на
//экран.

//Цикл while

import java.util.Scanner;
import static java.io.FileDescriptor.in;

public class lab21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числo:");
        int n = sc.nextInt();
        sc.close();

        int f = 1;
        int i = 1;
        if (n < 15)
            if (n >= 0) {
                while (i <= n)
                    f = f * i++;
                System.out.println("Факториал =");
                System.out.println(f);}
            else
            System.out.println("Введено некорректное число");
        else
        System.out.println("Введено некорректное число");
    }
}