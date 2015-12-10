package encryptionBase64;

import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.*;

public class Encrypt {
	static String ALGO="AES";

	public static String encrypt(String state, byte[] keyVal) throws Exception{

		Key key=generateKey(keyVal);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE, key);

		byte[] encVal = c.doFinal(state.getBytes());
		state = new BASE64Encoder().encode(encVal);
		
		return state;
	}
	
	public static String decrypt(String state, byte[] keyVal) throws Exception{
		
		Key key = generateKey(keyVal);
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedValue = new BASE64Decoder().decodeBuffer(state);
        byte[] decValue = c.doFinal(decodedValue);
        state = new String(decValue);
		
		return state;
	}

	private static Key generateKey(byte[] keyVal) throws Exception {
		Key key = new SecretKeySpec(keyVal, ALGO);
		return key;
	}

}
