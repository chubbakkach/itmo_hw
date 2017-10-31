//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
// выведите массивы на экран в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и сообщите,
// для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

public class Task5 {
    public static void main ( String[] args ) {
        final int min = 0; // Минимальное число для диапазона
        final int max = 5; // Максимальное число для диапазона
        int[] Mas1 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = rnd ( min, max );
            sum1 += Mas1[i];
            System.out.print ( Mas1[i] + " " );
        }
        System.out.print ( "\n" );
        int[] Mas2 = new int[5];
        for (int i = 0; i < Mas2.length; i++) {
            Mas2[i] = rnd ( min, max );
            sum2 += Mas2[i];
            System.out.print ( Mas2[i] + " " );
        }
        System.out.print ( "\n" );
        if (( sum1 / 5 ) == ( sum2 / 5 )) {
            System.out.print ( "Среднее арифметические элементов массивов равны" );
        } else if (( sum1 / 5 ) > ( sum2 / 5 )) {
            System.out.print ( "Среднее арифметическое элементов первого массива: " + ( sum1 / 5 ) + " и больше среднего арифметического второго массива: " + ( sum2 / 5 ) );
        } else {
            System.out.print ( "Среднее арифметическое элементов первого массива: " + ( sum1 / 5 ) + " и именьше среднего арифметического второго массива: " + ( sum2 / 5 ) );
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