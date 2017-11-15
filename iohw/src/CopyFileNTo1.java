import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileNTo1 {
    public static void main(String args[]) throws Exception {
        FileInputStream file1 = null;
        FileOutputStream file2 = null;
        String fileName = "";
        byte[] buf = new byte[1024];
        int len;
        try {
            File file = new File ( "E://Lena//projects//itmo_hw2//iohw//files1" );
            file2 = new FileOutputStream ( "fileLong2.txt" );
            for (int i = 0; i < file.list ().length; i++) {
                fileName = "E://Lena//projects//itmo_hw2//iohw//files1//" + file.list ()[i].toString ();
                file1 = new FileInputStream ( fileName );
                while (( len = file1.read ( buf ) ) > 0) {
                    file2.write ( buf, 0, len );
                }
            }
            //System.out.println(file.list ()[0].toString ());
            //
        } finally {
            file2.close ();
            if (file1 != null) {
                file1.close ();
            }
        }
    }

    }
