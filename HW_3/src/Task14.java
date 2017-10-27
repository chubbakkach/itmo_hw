
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Mas = new int[8][5];
        for(int i=0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                Mas[i][j]=(int)(Math.random()*90)+10;
                System.out.print(Mas[i][j]+" ");
            }
            System.out.println(" ");
        }
	}

}
