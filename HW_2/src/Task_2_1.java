/*Создать программу, проверяющую и сообщающую на экран, является ли целое число записанное в переменную n, чётным либо нечётным.*/
public class Task_2_1 {
    public static void main(String[] args) {
        final int min = 1; // Минимальное число для диапазона
        final int max = 99; // Максимальное число для диапазона
        int n = rnd(min, max);
        if (n % 2 == 0) // Делится на 2 без остатка?
        System.out.println("число "+n+" четное");
        else System.out.println("число "+n+" нечетное");
    }
    /**
     * Метод получения псевдослучайного целого числа от min до max (включая max);
     */
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
