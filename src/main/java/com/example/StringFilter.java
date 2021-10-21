package com.example;

import java.util.ArrayList;

public class StringFilter {
    public void run(){
        ArrayList<String>list = new ArrayList<>();
        list.add("amanda");
        list.add("är");
        list.add("bäst");
        int minLength = 2;
        
        System.out.println(remoteShort(list, minLength));
    }
    public ArrayList<String> remoteShort(ArrayList<String> list, int minLength) {

        ArrayList<String> list2 = new ArrayList<>();

        for (String string : list) {
            if (string.length()>minLength) {
                list2.add(string);
            }
        }
        return list2;
    }
}
/**
 * Skapa en klass StringFilter. I den skriver du en metod remoteShort. Den tar
 * två parametrar, En ArrayList<string> och en int minLength
 * 
 * Den tar en ArrayList<String> och ska returnera en NY ArrayList<string> där
 * endast strängar LÄNGRE ÄN minLength ingår
 * 
 * 
 * 
 * Klistra in hela StringFilter
 */