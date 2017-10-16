/*Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.*/
public class Task_2_1_2 {
    public static void main(String[] args) {
        final int min = 5; // Минимальное число для диапазона
        final int max = 155; // Максимальное число для диапазона
        int n = rnd(min, max);
        //System.out.println(n);
        if (n>25&&n<100)
            System.out.println("Число "+n+" содержится в интервале (25,100)");
        else
            System.out.println("Число "+n+" не содержится в интервале (25,100)");
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