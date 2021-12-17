package com.json;

import com.json.GsonParser;
import com.model.Root;

public class Main {
    public static void main(String[] args) {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();
        System.out.println("Root" + root.toString());
    }
}
