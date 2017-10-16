/*Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.*/
public class Task_2_2_2 {
    public static void main(String[] args) {
        final int min = 100; // Минимальное число для диапазона
        final int max = 999; // Максимальное число для диапазона
        int n = rnd(min, max);
        String str = Integer.toString(n);//строка
        int l=str.length();//длина строки
        int[] m = new int[l];//массив
        int i=0;//индекс
        /*заполняем массив*/
        int n2=n;
        while (i<l){
            m[i]=n2%10;
            n2=n2/10;
            i++;
        }
        /*Ищем максимальное число в массиве*/
        int maxm=m[0];
        for(i = 0; i < l; i++) {
            if (m[i] > maxm)
                maxm = m[i];
        }
        System.out.println("В числе "+n+" наибольшая цифра "+maxm);
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
