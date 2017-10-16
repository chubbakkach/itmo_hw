/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел*/
public class Task_2_2 {
    public static void main(String[] args) {
        final double max = 100; // Максимальное число для диапазона
        final double m = rnd(max);
        final double n = rnd(max);
        if (Math.abs(10-m)>Math.abs(10-n))
            System.out.println("Число "+n+" ближе к 10 чем число "+m);
        else if (Math.abs(10-m)<Math.abs(10-n))
            System.out.println("Число "+m+" ближе к 10 чем число "+n);
        else System.out.println("Число "+m+" равно числу "+n);
    }
    /**
     * Метод получения псевдослучайного вещественного числа от 0 до max (исключая max);
     */
    public static double rnd(final double max)
    {
        return Math.random() * max;
    }
}

