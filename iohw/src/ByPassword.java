import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByPassword {

    public static void main ( String args[] ) throws Exception {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;
        String stringPassword = "somePassword";
        byte[] password = new byte[stringPassword.length ()];
        password = stringPassword.getBytes ();
        //encode
        try {
            fileIn = new FileInputStream ( "someText.txt" );
            fileOut = new FileOutputStream ( "someTextEncodedByPassword.txt" );
            byte[] buf = new byte[password.length * 100];
            int len;
            byte[] encodedBuf;
            ////
            while (( len = fileIn.read ( buf ) ) > 0) {
                encodedBuf = Encoding.encode ( buf, password );
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
            fileIn = new FileInputStream ( "someTextEncodedByPassword.txt" );
            fileOut = new FileOutputStream ( "someTextDecodedByPassword.txt" );
            byte[] buf = new byte[password.length * 100];
            int len;
            byte[] decodedBuf;
            //
            while (( len = fileIn.read ( buf ) ) > 0) {
                decodedBuf = Encoding.decode ( buf, password );
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
