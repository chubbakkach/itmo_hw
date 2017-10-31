//Пользователь должен указать с клавиатуры чётное положительное число,
// а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
// После этого программа должна определить и сообщить пользователю о том,
// сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
// Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
// пока не будет указано корректное значение.

import java.util.Scanner;

public class Task11 {
    public static void main ( String[] args ) {
        Scanner scn = new Scanner ( System.in );
        int a;
        int suml = 0;
        int sumr = 0;
        System.out.println ( "Введите четное положительное число: " );
        if (scn.hasNextInt ()) {
            do {
                a = scn.nextInt ();
                if (a % 2 != 0) System.out.println ( "Число нечетное, повторите попытку" );
                if (a < 1) System.out.println ( "Число отрицательное, повторите попытку" );
            } while (a % 2 != 0 || a < 1);
            int m = a / 2 - 1;//середина
            int[] Mas = new int[a];
            for (int i = 0; i < Mas.length; i++) {
                Mas[i] = (int) ( Math.random () * 11 ) - 5;
                System.out.print ( Mas[i] + " " );
                if (i <= m) {
                    suml += Math.abs ( Mas[i] );
                } else {
                    sumr += Math.abs ( Mas[i] );
                }
            }
            System.out.println ( "\n" );
            if (suml == sumr) System.out.println ( "Суммы модулей левой и правой половин массива равны" );
            else if (suml > sumr) System.out.println ( "Сумма модулей левой половины массива больше правой" );
            else System.out.println ( "Сумма модулей правой половины массива больше левой" );
        } else System.out.println ( "Введено не число" );
    }
}
