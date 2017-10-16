/*Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.*/
public class Task_2_3 {
    public static void main(String[] args) {
        final double max = 100; // Максимальное число для диапазона
        final double a = rnd(max);
        final double b = rnd(max);
        final double c = rnd(max);
        double d=b*b-4*a*c;
        System.out.println("Квадратное уравнение ax²+bx+c=0, где \na="+a+"\nb="+b+"\nc="+c+"\nd="+d);
        //System.out.println(d);
        if (d<0)
            System.out.println("Не имеет корней");
        else if (d==0)
            System.out.println("Имеет один корень: "+((-1*b)/2*a));
        else System.out.println("Имеет два корня: "+(((-1*b)+Math.sqrt(d))/(2*a))+" и "+(((-1*b)-Math.sqrt(d))/(2*a)));
    }
    /**
     * Метод получения псевдослучайного вещественного числа от 0 до max (исключая max);
     */
    public static double rnd(final double max)
    {
        return Math.random() * max;
    }
}