package by.itacademy.zaitsev;

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {
        //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        Scanner input = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            System.out.println("Sum = " + (x + y));
            System.out.println("Mutli = " + (x * y));
        }
    }
}
