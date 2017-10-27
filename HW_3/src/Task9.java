//Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
// Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
// к элементу из второго массива с i-ым индексом.
// Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
public class Task9 {
    public static void main ( String[] args ) {
        int[] Mas1 = new int[10];
        int[] Mas2 = new int[10];
        double[] Mas3 = new double[10];
        int count = 0;
        for (int i = 0; i < Mas1.length; i++) {
            Mas1[i] = (int) ( Math.random () * 8 ) + 1;
            System.out.print ( Mas1[i] + " " );
        }
        System.out.print ( "\n" );
        for (int i = 0; i < Mas2.length; i++) {
            Mas2[i] = (int) ( Math.random () * 8 ) + 1;
            System.out.print ( Mas2[i] + " " );
        }
        System.out.print ( "\n" );
        for (int i = 0; i < Mas3.length; i++) {
            Mas3[i] = (double) Mas1[i] / Mas2[i];
            System.out.print ( Mas3[i] + " " );
        }
        System.out.print ( "\n" );
        for (int i = 0; i < Mas3.length; i++) {
            if (Mas3[i] % (int) Mas3[i] == 0) {
                count++;
            }
        }
        System.out.print ( count );
    }
}
