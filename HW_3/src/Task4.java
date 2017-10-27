//Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
// Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
public class Task4 {
    public static void main ( String[] args ) {
        final int min = 1; // Минимальное число для диапазона
        final int max = 10; // Максимальное число для диапазона
        int b = 0;
        int[] Mas = new int[8];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = rnd ( min, max );
            System.out.print ( Mas[i] + " " );
        }
        System.out.print ( "\n" );
        for (int i = 0; i < Mas.length; i++) {
            if (i % 2 != 0) Mas[i] = 0;
            System.out.print ( Mas[i] + " " );
        }
        //System.out.print("\n"+b);
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd ( int min, int max ) {
        max -= min;
        return (int) ( Math.random () * ++max ) + min;
    }
}