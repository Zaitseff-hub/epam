package by.itacademy.zaitsev;

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
        Scanner input = new Scanner(System.in);
        for (int i = 0; true; i++) {
            StringBuffer toll = new StringBuffer(input.nextLine());
            toll.reverse();
            System.out.println("Hello " + toll.toString());
        }
    }
}
