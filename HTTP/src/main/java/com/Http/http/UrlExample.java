package com.Http.http;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {

    public static void main(String[] args) throws IOException {
        URL url = new URL("file:/home/mohito/IdeaProjects/project-for-education/HTTP/src/main/java/com/Http/udp/DatagramRunner.java");
        var urlConnection = url.openConnection();

        System.out.println(new String(urlConnection.getInputStream().readAllBytes()));

    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        URLConnection urlConnection = url.openConnection();
        urlConnection.setDoOutput(true);

        System.out.println(urlConnection.getHeaderFields());

    }
}
