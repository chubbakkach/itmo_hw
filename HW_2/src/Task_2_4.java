/*в переменную n должно записываться случайное (на время тестирования программы) целое число из [0;28800], далее оно должно выводиться на экран (для Петрова) и на следующей строке (для сотрудниц) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.*/
public class Task_2_4 {
    public static void main(String[] args) {
        final int min = 0; // Минимальное число для диапазона
        final int max = 28800; // Максимальное число для диапазона
        int s = rnd(min, max);
        int h = s/3600;
        switch (h) {
            case (1):
                System.out.println(s+"\nОсталcя "+h+" час");
                break;
            case (2):
            case (3):
            case (4):
                System.out.println(s+"\nОсталось "+h+" часа");
                break;
            case (5):
            case (6):
            case (7):
            case (8):
            case (0):
                System.out.println(s+"\nОсталось "+h+" часов");
                break;
            default:
                System.out.println(s+"\nДомой");
                break;
        }
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