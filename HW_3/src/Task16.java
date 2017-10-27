
public class Task16 {
	public static void main(String[] args) {
	       int [][] Mas = new int[7][4];
	        int [] Mas1 = new int[Mas.length]; // массив произведений
	        for(int i =0;i<Mas.length;i++){
	            for(int h=0;h<Mas[i].length;h++){
	                Mas[i][h]=(int)(Math.random()*11)-5;
	                System.out.print(Mas[i][h]+" ");
	                if(h==0)Mas1[i]=Mas[i][h];
	                else Mas1[i]*=Mas[i][h];
	                if(h==Mas[i].length-1)
	                    System.out.println(" ");
	            }
	        }
	        int max=0,max_i=0;
	        for(int i=0;i<Mas1.length;i++){
	            if(Math.abs(Mas1[i])>max){
	                max=Mas1[i];
	                max_i=i;
	            }
	        }
	        System.out.println("Наибольшее произведение модулей элементов по строке равно ("+max+") индекс строки:  "+max_i);
	}
}
