//Исключение чисел, содержащий цифру 4 или число 13
public class Task_3_13 {
    public static void main ( String[] args ) {
        int count = 0;
        int n1 = 4;
        int n2 = 13;
        String s1 = String.valueOf ( n1 );
        String s2 = String.valueOf ( n2 );
        for (int i = 4; i <= 99994; i++) {
            String s = String.valueOf ( i );
            if (s.contains ( s1 ) || s.contains ( s2 )) {
                count++;
            }
        }
        System.out.println ( count );
    }
}
