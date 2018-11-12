package com.divine.strategy;

import com.divine.strategy.strategies.AesEncryptionStrategy;
import com.divine.strategy.strategies.BlowFishEncryptionStrategy;

public class Main {

    public static void main(String[] args) {
        Encryptor aesEncryptor = new Encryptor(new AesEncryptionStrategy());
        Encryptor blowfishEncryptor = new Encryptor(new BlowFishEncryptionStrategy());

        String encryptedValue = aesEncryptor.encrypt("Hello world");
        aesEncryptor.decrypt(encryptedValue);

        encryptedValue = blowfishEncryptor.encrypt("Hello world");
        blowfishEncryptor.decrypt(encryptedValue);
    }
}
