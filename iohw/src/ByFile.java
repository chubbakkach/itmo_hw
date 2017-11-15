import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByFile {
    public static void main ( String args[] ) throws Exception {
        FileInputStream fileIn = null;
        FileInputStream fileKeyIn = null;
        FileOutputStream fileOut = null;
        byte[] key;
        try{
            fileKeyIn=new FileInputStream ( "fileKey.txt" );
            key = fileKeyIn.readAllBytes ();
        } finally {
            if (fileKeyIn != null) {
                fileKeyIn.close ();
            }
        }
        try {
            fileIn = new FileInputStream ( "someText.txt" );
            fileOut = new FileOutputStream ( "someTextEncodedByFile.txt" );
            byte[] buf = new byte[key.length*100];
            int len;
            byte[] encodedBuf;
            ////
            while (( len = fileIn.read ( buf ) ) > 0) {
                encodedBuf = Encoding.encode ( buf, key );
                fileOut.write ( encodedBuf, 0, len );
            }
        } finally {
            fileOut.close ();
            if (fileIn != null) {
                fileIn.close ();
            }
        }
        //decode
        try{
            fileIn = new FileInputStream ( "someTextEncodedByFile.txt" );
            fileOut = new FileOutputStream ( "someTextDecodedByFile.txt" );
            byte[] buf = new byte[key.length * 100];
            int len;
            byte[] decodedBuf;
            //
            while (( len = fileIn.read ( buf ) ) > 0) {
                decodedBuf = Encoding.decode ( buf, key );
                fileOut.write ( decodedBuf, 0, len );
            }
        } finally {
            fileOut.close ();
            if (fileIn != null) {
                fileIn.close ();
            }
        }
    }
}
