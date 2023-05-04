package com.example.networking;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("WeakerAccess")
public class Mountain {

    private String name;
    private String location;
    private int size;


    public Mountain(String name, String location, int  height) {

        this.name = name;
        this.location = location;
        this.size = size;
    }

    @Override
    public String toString() {
        String output= name+" "+location+" "+size;
        return output;
    }
}

