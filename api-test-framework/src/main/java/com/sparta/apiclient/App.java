package com.sparta.apiclient;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        HttpClient client = HttpClient.newBuilder().build();

        // This request will be excuted by our client (postman)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.postcodes.io/postcodes/ec2y5as"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response);
        System.out.println(response.headers());
        System.out.println(response.statusCode());
        System.out.println(response.body());

        Map<String, List<String>> headers = response.headers().map();
//
//        for (var item : headers.entrySet()){
//            System.out.println(item.getKey() + ": ");
//            System.out.println(item.getValue());
//        }
        System.out.println();
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(response.body());
        System.out.println(jsonObject.get("status"));
        JSONObject resultObject = (JSONObject)jsonObject.get("result");
        System.out.println(resultObject.get("nhs_region"));
    }
}
