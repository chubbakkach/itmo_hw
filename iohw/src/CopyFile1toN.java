import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1toN {
    public static void main(String args[]) throws IOException{
        FileInputStream fileIn=null;
        FileOutputStream fileOut=null;
        try{
            fileIn = new FileInputStream ( "fileLong.txt" );
            byte[] buf= new byte[1024];// размер
            int len;
            int n=1;
            String fileName="";
            while((len = fileIn.read (buf))>0){
                fileName="E://Lena//projects//itmo_hw2//iohw//files1//file_"+String.valueOf(n)+".txt";
                fileOut = new FileOutputStream ( fileName );
                fileOut.write ( buf,0,len );
                n++;
            }
            //
        } finally {
            fileOut.close ();
            if(fileIn!=null){
                fileIn.close ();
            }
        }
    }
}
