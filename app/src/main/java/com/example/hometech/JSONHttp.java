package com.example.hometech;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class JSONHttp {
    public static String makeHttpRequest(String url){
        String strResult = "";

        try {
            URL u = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
            strResult = readStream(connection.getInputStream());
        } catch (Exception e){
            e.printStackTrace();
        }

        return strResult;
    }

    private static String readStream(InputStream inputStream){
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();

        try{
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while((line = reader.readLine()) != null){
                stringBuilder.append(line + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try{
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }
        return stringBuilder.toString();
    }

    public interface AsyncResponse{
        void processFinish(String output);
    }
}// end class
