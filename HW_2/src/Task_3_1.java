//Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
public class Task_3_1 {
    public static void main ( String[] args ) {
        for (int a = 1000; a <= 9999; a = a + 3) {
            System.out.println ( a + " " );
        }
    }
}
