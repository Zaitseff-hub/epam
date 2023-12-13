package by.itacademy.zaitsev;

import java.util.Scanner;

public class MainTask1 {
    public static void main (String[] args) {
        //1.Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner input = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Hello " + input.nextLine());
        }
    }
}