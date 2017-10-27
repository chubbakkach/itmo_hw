//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.

import java.util.Scanner;

public class Task_3_5 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ); // создаём объект класса Scanner
        int a;
        long b = 1;
        System.out.print ( "Введите целое число: " );
        if (sc.hasNextInt ()) { // возвращает истинну если с потока ввода можно считать целое число
            a = sc.nextInt ();
            for (int i = a; i > 0; i--) {
                b *= i;
            }
            System.out.println ( "Факториал числа " + a + " равен " + b );
        } else {
            System.out.println ( "Вы ввели не целое число" );
        }
    }
}
