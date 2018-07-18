package com.ex2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fileread {

    public static String convertUpper(String querystring) {
        try {
            FileReader file = new FileReader(querystring);
            @SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(file);
            for (String line; (line = bf.readLine()) != null;) {

                String Upper = line.toUpperCase();
                return Upper;
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String findLength(String querystring) {
        try {
            File f = new File(querystring);
            double len = f.length();
            String leng = Double.toString(len);

            return leng;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
