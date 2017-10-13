public class Task_2_and_Task_4 {
    public static void main(String[] args) {
        final int min = 10; // Минимальное число для диапазона
        final int max = 999; // Максимальное число для диапазона
        int n,n1,n2;
        n = n1 = rnd(min, max);
        int sum=0;
        //System.out.println(n1);
        //System.out.println(sum);
        while (n1 >= 1) {
            n2=n1%10;
            n1=n1/10;
            sum+=n2;
        }
        System.out.print("Сумма цифр числа "+n+" равна "+sum);
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