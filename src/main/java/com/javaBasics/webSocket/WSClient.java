package com.javaBasics.webSocket;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.Date;

public class WSClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        WebSocketHandler wsh = new WebSocketHandler(4200);
        wsh.start();

    }
}