//) Проверьте, является ли введённое пользователем с клавиатуры натуральное число — простым. Постарайтесь не выполнять лишних действий

import java.util.Scanner;

public class Task_3_7 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in ); // создаём объект класса Scanner
        int a;
        System.out.print ( "Введите целое число: " );
        if (sc.hasNextInt ()) { // возвращает истинну если с потока ввода можно считать целое число
            a = sc.nextInt ();
            for (int i = (int) Math.sqrt ( a ); i >= 1; i--) {
                if (a % i == 0 & i != 1) {
                    System.out.println ( "Заданное число - составное" );
                    break;
                }
                if (i == 1) System.out.println ( "Заданное число простое" );
            }
        } else System.out.println ( "Вы ввели не целое число" );
    }
}