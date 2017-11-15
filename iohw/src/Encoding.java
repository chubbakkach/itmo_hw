public class Encoding {
    public static byte[] encode ( byte[] T, byte[] k ) {
        byte[] someText;
        byte[] key;

        someText = T;
        key = k;

        byte[] result = new byte[someText.length];

        for (int i = 0; i < someText.length; i++) {
            result[i] = (byte) ( someText[i] ^ key[i % key.length] );
        }
        return result;
    }

    public static byte[] decode (byte[] te, byte[] k) {
        byte[] textEncoded;
        byte[] key;

        textEncoded = te;
        key = k;

        byte[] result = new byte[textEncoded.length];

        for (int i = 0; i < textEncoded.length; i++) {
            result[i] = (byte) (textEncoded[i] ^ key[i % key.length]);
        }
        return result;
    }
}
