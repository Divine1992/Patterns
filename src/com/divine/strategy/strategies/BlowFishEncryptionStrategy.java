package com.divine.strategy.strategies;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.NoSuchAlgorithmException;

public class BlowFishEncryptionStrategy implements EncryptorStrategy {
    private static final String ENCRYPT_KEY = "6ddskdAcxca23sac";

    @Override
    public String encrypt(String value) {
        System.out.println("-------Encrypting data using Blowfish algorithm-------");
        try {
            Cipher cipher = Cipher.getInstance("Blowfish");
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            String encryptedValue = Base64.encodeBase64URLSafeString(cipher.doFinal(value.getBytes()));
            System.out.println(encryptedValue+"\n");
            return encryptedValue;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        throw new InvalidParameterException("Invalid parameter");
    }

    @Override
    public String decrypt(String value) {
        System.out.println("-------Decrypting data using Blowfish algorithm-------");
        try {
            Cipher cipher = Cipher.getInstance("Blowfish");
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            String decryptedValue = new String(cipher.doFinal(Base64.decodeBase64(value)));
            System.out.println(decryptedValue+"\n");
            return decryptedValue;
        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        throw new InvalidParameterException("Invalid parameter");
    }

}
