import java.util.Arrays;

public class Task_2_3_2 {
    public static void main(String[] args) {
        int a=7;
        int b=-4;
        int c=5;
        int[] m = new int[3];//массив
        m[0]=a;
        m[1]=b;
        m[2]=c;
        Arrays.sort(m);
        System.out.println("Числа в переменных a, b и c: "+a+","+b+","+c+"\nВозрастающая последовательность: "+m[0]+","+m[1]+","+m[2]);
    }
    }
