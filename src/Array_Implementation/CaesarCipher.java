package Array_Implementation;

/**Class for doing encryption and decryption using the Caesar cipher...*/
public class CaesarCipher {
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];
    /**Constructor that initialize the encoder and decoder...*/
    public CaesarCipher(int rotation){
        for(int k = 0; k<26; k++){
            encoder[k] = (char)('A'+(k+rotation)%26);
            decoder[k] = (char)('A'+(k-rotation+26)%26);
        }
    }
    /**Returns string representing encrypted message...*/
    public String encrypt(String message){
        return transform(message, encoder);
    }
    /**Returns decrypted message using encrypted secret...*/
    public String decrypt(String secret){
        return transform(secret, decoder);
    }
    /**Returns transformation of original string...*/
    private String transform(String original, char[] code){
        char[] msg = original.toCharArray();
        for(int k = 0; k < msg.length; k++){
            if(Character.isUpperCase(msg[k])){
                int j = msg[k] - 'A';
                msg[k] = code[j];
            }
        }
        return new String(msg);
    }

    /**Simple main method for testing Caesar cipher...*/
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3);
        System.out.println("Encryption code= "+new String(cipher.encoder));
        System.out.println("Decryption code= "+new String(cipher.decoder));
        String msg = "THE EAGLE IS IN PLAY; MEET AT JOE'S";
        String coded = cipher.encrypt(msg);
        System.out.println("Secret: "+coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: "+answer);
    }
}
