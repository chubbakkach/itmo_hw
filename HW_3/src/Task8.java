//Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
// Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив
public class Task8 {
    public static void main ( String[] args ) {
        final int min = -15; // Минимальное число для диапазона
        final int max = 15; // Максимальное число для диапазона
        int[] Mas = new int[12];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = rnd ( min, max );
            System.out.print ( Mas[i] + " " );
        }
        System.out.print ( "\n" );
        int m = Mas[0];
        int i2 = 0;
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] >= m) {
                m = Mas[i];
                i2 = i;
            }
        }
        System.out.print ( "Максивальное число массива: " + m + " Последнее вхождение: " + i2 );
    }

    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd ( int min, int max ) {
        max -= min;
        return (int) ( Math.random () * ++max ) + min;
    }
}