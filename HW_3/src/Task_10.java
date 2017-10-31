//Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
// выведите массив на экран в строку.
// Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
// Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.

public class Task_10 {
    public static void main ( String[] args ) {
        int[] Mas = new int[11];
        int m = 0;
        int z = 0;
        int p = 0;
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) ( Math.random () * 3 ) - 1;
            System.out.print ( Mas[i] + " " );
            if (Mas[i] < 0) m++;
            if (Mas[i] == 0) z++;
            if (Mas[i] > 0) p++;
        }
        System.out.print ( "\n" );
        if (m > z & m > p) System.out.println ( "Чаще всего встречается -1" );
        if (z > m & z > p) System.out.println ( "Чаще всего встречается 0" );
        if (p > m & p > z) System.out.println ( "Чаще всего встречается 1" );
    }
}
