//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Task_3_2 {
    public static void main ( String[] args ) {
        int a = 1;
        for (int i = 0; i <= 55; i++) {
            a = a + 2;
            System.out.println ( a );
        }

    }
}

