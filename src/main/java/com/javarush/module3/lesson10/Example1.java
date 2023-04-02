package com.javarush.module3.lesson10;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Example1 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        HttpClient client = HttpClient.newBuilder()
//                .version(Version.HTTP_1_1)
//                .followRedirects(Redirect.NORMAL)
//                .connectTimeout(Duration.ofSeconds(20))
//                .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
//                .authenticator(Authenticator.getDefault())
//                .build();
//        HttpRequest request = null;
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.statusCode());
//        System.out.println(response.body());


        HttpClient client2 = HttpClient.newHttpClient();

        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://javarush.com/"))
                .build();


        client2.sendAsync(request1, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
                .thenAccept(System.out::println).join();

        HttpResponse<String> response = client2.send(request1, HttpResponse.BodyHandlers.ofString());
        System.out.println("URI: " + response.uri());
//        System.out.println("Body: " + response.body());
        System.out.println("Headers: " + response.headers());
        System.out.println("Status code: " + response.statusCode());


    }
}
