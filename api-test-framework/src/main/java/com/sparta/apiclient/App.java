package com.sparta.apiclient;

import org.json.simple.JSONArray;
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

        List<String> postcodes = List.of("EC2Y5AS", "OX495NU", "M320JG", "NE301DP");

        // Build the request body: {"postcodes": ["EC2Y5AS", "OX495NU", ...]}
        JSONArray postcodeArray = new JSONArray();
        postcodeArray.addAll(postcodes);
        JSONObject requestBody = new JSONObject();
        requestBody.put("postcodes", postcodeArray);

        // Bulk lookup is a POST to /postcodes with a JSON body
        HttpRequest bulkRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://api.postcodes.io/postcodes"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody.toJSONString()))
                .build();

        HttpResponse<String> bulkResponse = client.send(bulkRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(bulkResponse);
        System.out.println(bulkResponse.statusCode());
        System.out.println();

        JSONParser bulkJsonParser = new JSONParser();
        JSONObject bulkJsonObject = (JSONObject) bulkJsonParser.parse(bulkResponse.body());
        System.out.println("Status: " + bulkJsonObject.get("status"));

        // In bulk responses, "result" is an array of {"query": ..., "result": {...}}
        JSONArray results = (JSONArray) bulkJsonObject.get("result");

        for (Object item : results) {
            JSONObject entry = (JSONObject) item;
            String query = (String) entry.get("query");
            JSONObject postcodeData = (JSONObject) entry.get("result");
        }
    }
}