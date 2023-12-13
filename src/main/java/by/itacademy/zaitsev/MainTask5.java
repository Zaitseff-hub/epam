package by.itacademy.zaitsev;

import java.util.Scanner;

public class MainTask5 {
    static void setMonth(int a) {
        String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        String s;
        try {
            s = month[a - 1];
            System.out.println("Это месяц - " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int n = sc.nextInt();
        setMonth(n);
    }
    }
