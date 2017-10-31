//Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
// Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
public class Task3 {
    public static void main ( String[] args ) {
        final int min = 0; // Минимальное число для диапазона
        final int max = 9; // Максимальное число для диапазона
        int b = 0;
        int[] Mas = new int[15];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = rnd ( min, max );
            System.out.print ( Mas[i] + " " );
            if (Mas[i] > 0 & Mas[i] % 2 == 0) b++;
        }
        System.out.print ( "\n" + b );
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd ( int min, int max ) {
        max -= min;
        return (int) ( Math.random () * ++max ) + min;
    }
}