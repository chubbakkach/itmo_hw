import java.io.*;

public class CopyFile {
    public static void main(String args[]) throws Exception{
        FileInputStream file1=null;
        FileOutputStream file2=null;
        try{
            file1 = new FileInputStream ( "file1.txt" );
            file2 = new FileOutputStream ( "file2.txt" );
            byte[] buf= new byte[1024];
            int len;

            while((len = file1.read (buf))>0){
                file2.write ( buf,0,len );
            }
            //
        } finally {
            file2.close ();
            if(file1!=null){
                file1.close ();
            }
        }

    }
}

