package by.itacademy.zaitsev;

public class MainTask3 {
    public static void main(String[] args) {
        //( Math.random() * (b-a) ) + a

        int a = 0; // Начальное значение диапазона - "от"
        int b = 250; // Конечное значение диапазона - "до"
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }
    }
}
