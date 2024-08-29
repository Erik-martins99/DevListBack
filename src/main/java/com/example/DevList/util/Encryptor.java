package com.example.DevList.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encryptor {

    public static String enconder(String data) {
        BCryptPasswordEncoder dataEncoder = new BCryptPasswordEncoder();
        return dataEncoder.encode(data);
    }
}
