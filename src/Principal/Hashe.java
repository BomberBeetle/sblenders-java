package Principal;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;

public class Hashe{
	    public static String Hash(String pass, String salt) throws NoSuchAlgorithmException, InvalidKeySpecException{
	        int dkLen = 64;
            int rounds = 1000;
            PBEKeySpec keySpec = new PBEKeySpec(pass.toCharArray(), salt.getBytes(), rounds, dkLen * 8);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] out = factory.generateSecret(keySpec).getEncoded();
            String st = "";
            for (byte b : out) {
                st += String.format("%02X", b);
            }
            return st;
	  }

    Hashe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



