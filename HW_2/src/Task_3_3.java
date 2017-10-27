//Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
public class Task_3_3 {
    public static void main ( String[] args ) {
        for (int n = 90; n >= 0; n = n - 5) {
            System.out.println ( n );
        }
    }
}
