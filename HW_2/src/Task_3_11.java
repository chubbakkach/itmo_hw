//сколько табличек с цифрой 2
public class Task_3_11 {
    public static void main ( String[] args ) {
        int count = 0;
        for (int i = 2; i <= 50000; i++) {
            String s = String.valueOf ( i );//преобразовываем в строку
            if (s.indexOf ( '2' ) > -1) {
                count++;
            }
        }
        System.out.println ( count );
    }
}
