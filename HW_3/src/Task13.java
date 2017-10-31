//������������ ������ � ���������� ����������� ����� ������� 3, ������� ����������� � ���������� n. 
//���� ������������ ��� �� ���������� �����, �� ��������� ������ ������� ������������ ��������� ����. 
//������� ������ �� n ��������� ����� ����� �� ������� [0;n] � ������� ��� �� �����. 
//������� ������ ������ ������ �� ������ ��������� ������� �������, ���� ��� ��� ����, � ������� ��� �� �����.
import java.util.Scanner;
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,a2=0;
        do{
            Scanner scn = new Scanner(System.in);
            System.out.println("... 3:");
            if(scn.hasNextInt()){
                n=scn.nextInt();
            }
            else System.out.println("...");
        }
        while (n<4);
        int[] Mas1 = new int[n];
        for(int i=0;i<Mas1.length;i++){
            Mas1[i]=(int)(Math.random()*(n+1));
            System.out.print(Mas1[i]+" ");
            if(Mas1[i]%2==0&Mas1[i]!=0)a2++;
        }
        System.out.println("");
        if(a2>0){
            int[] Mas2 = new int[a2];
            for(int i=0,i2=0;i<Mas1.length;i++){
                if (Mas1[i]%2==0&Mas1[i]!=0){
                    Mas2[i2]=Mas1[i];
                    System.out.print(Mas2[i2]+" ");
                }
            }
        }
	}

}
