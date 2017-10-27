// Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр

import java.util.Scanner;

public class Task_3_9 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ); // создаём объект класса Scanner
        int a;
        System.out.print ( "Введите целое число: " );
        if (sc.hasNextInt ()) { // возвращает истинну если с потока ввода можно считать целое число
            a = sc.nextInt ();
            int n = 0;
            int sum = 0;
            int a2 = a;
            while (a >= 1) {
                n = a % 10;
                a = a / 10;
                sum += n;
            }
            System.out.print ( "Сумма цифр числа " + a2 + " равна " + sum );
        } else System.out.println ( "Вы ввели не целое число" );
    }
}
