
public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] Mas = new int[5][8];
       for(int i =0;i<Mas.length;i++){
           for(int h=0;h<Mas[i].length;h++){
               Mas[i][h]=(int)((Math.random()*199)-99);
               System.out.print(Mas[i][h]+" ");
           }
           System.out.print(" ");
       }
       int min=Mas[0][0];
       for(int i =0;i<Mas.length;i++){
           for(int h=0;h<Mas[i].length;h++){
               if(Mas[i][h]>min)min=Mas[i][h];
           }
       }
       System.out.println(" ");
       System.out.println("�������� ������������� �������� ������� = "+min);
	}

}
