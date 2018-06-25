package com.hackerrank.job.movie_title;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpWalaCode {

    static int getNumberOfMovies(String substr) {
        /*
         * Endpoint: "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
         */
        final String USER_AGENT = "Mozilla/5.0";
        StringBuffer response = new StringBuffer();

        try {

            String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + substr;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            // optional default is GET
            con.setRequestMethod("GET");

            //add request header
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {

        }

        JsonParser jsonParser = new JsonParser();
        JsonObject jo = (JsonObject) jsonParser.parse(String.valueOf(response));

        return jo.get("total").getAsInt();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getNumberOfMovies("maze"));
    }
}
