public class Task1 {
    public static void main ( String[] args ) {
        int a = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) a++;// размер массива
        }
        int[] Mas = new int[a]; // создаем массив
        for (int i = 2, b = 0; i <= 20; i++) { //заполняем массив
            if (i % 2 == 0) {
                Mas[b] = i;
                System.out.print ( Mas[b] + " " ); //выводим в строку
                b++;
            }
        }
        System.out.println ( " " );
        for (int i = 0; i < Mas.length; i++) {
            System.out.println ( Mas[i] ); //выводим в столбец
        }
    }
}
