package com.divine.strategy;

import com.divine.strategy.strategies.EncryptorStrategy;

public class Encryptor {
    private EncryptorStrategy strategy;

    public Encryptor(EncryptorStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String value) {
        return this.strategy.encrypt(value);
    }

    public String decrypt(String value) {
        return this.strategy.decrypt(value);
    }

}
