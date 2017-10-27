//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
// выведите его на экран в строку.
// Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

public class Task_6 {
    public static void main ( String[] args ) {
        final int min = 10; // Минимальное число для диапазона
        final int max = 99; // Максимальное число для диапазона
        int[] Mas = new int[4];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = rnd ( min, max );
            System.out.print ( Mas[i] + " " );
        }
        System.out.print ( "\n" );
        for (int i = 0; i < Mas.length; i++) {
            if (i > 0) {
                if (Mas[i - 1] >= Mas[i]) {
                    System.out.println ( "Последовательсность не возрастающая" );
                    break;
                }
            }
            if (i == Mas.length - 1) System.out.println ( "Последовательность возрастающая" );
        }
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd ( int min, int max ) {
        max -= min;
        return (int) ( Math.random () * ++max ) + min;
    }
}