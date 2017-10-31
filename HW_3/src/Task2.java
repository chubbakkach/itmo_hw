public class Task2 {
    public static void main ( String[] args ) {
        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) a++;// размер массива
        }
        int[] Mas = new int[a]; // создаем массив
        for (int i = 1, b = 0; i <= 99; i++) { //заполняем массив
            if (i % 2 != 0) {
                Mas[b] = i;
                System.out.print ( Mas[b] + " " ); //выводим в строку
                b++;
            }
        }
        System.out.println ( " " );
        for (int i = a - 1; i > -1; i--) {
            System.out.println ( Mas[i] ); //выводим в столбец
        }
    }
}
