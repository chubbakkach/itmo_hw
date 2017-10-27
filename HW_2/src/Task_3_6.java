//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.

import java.util.Scanner;

public class Task_3_6 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ); // создаём объект класса Scanner
        int a;
        System.out.print ( "Введите целое число: " );
        if (sc.hasNextInt ()) { // возвращает истинну если с потока ввода можно считать целое число
            a = sc.nextInt ();
            System.out.print ( "Делителb числа " + a + ": " );
            for (int i = a; i > 0; i--) {
                int b = a % i;
                if (b == 0) System.out.println ( i + " " );
            }
        } else System.out.println ( "Вы ввели не целое число" );
    }
}