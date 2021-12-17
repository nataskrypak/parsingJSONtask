package com.json;

import com.google.gson.Gson;
import com.model.Root;

import java.io.FileReader;


public class GsonParser {
    public Root parse() {
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("settings.json")) {
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
        return null;
    }
}
