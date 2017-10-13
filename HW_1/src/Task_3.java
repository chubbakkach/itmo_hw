public class Task_3 {
    public static void main(String[] args) {
        final double max = 100; // Максимальное число для диапазона
        final double rnd = rnd(max);
        System.out.println(rnd);
        System.out.println(Math.round(rnd));
        System.out.println("Случайное число: "+rnd+"\nОкругленное число: "+Math.round(rnd));
    }
    /**
     * Метод получения псевдослучайного вещественного числа от 0 до max (исключая max);
     */
    public static double rnd(final double max)
    {
        return Math.random() * max;
    }
}
