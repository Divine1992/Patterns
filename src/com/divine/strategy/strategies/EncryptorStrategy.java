package com.divine.strategy.strategies;

public interface EncryptorStrategy {
    String encrypt(String value);
    String decrypt(String value);
}
