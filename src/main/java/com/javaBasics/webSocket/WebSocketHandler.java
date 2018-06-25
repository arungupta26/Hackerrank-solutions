package com.javaBasics.webSocket;

import com.google.gson.Gson;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;


import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.Map;
import org.json.simple.JSONObject;

public class WebSocketHandler extends WebSocketServer {

    public static WebSocket s_connection;


    public WebSocketHandler(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        s_connection = conn;
        System.out.println("Opened WebSocket Connection");
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {

    }

    @Override
    public void onMessage(WebSocket conn, String message) {

        Map<String, Object> object = new JSONObject();
        object.put("eventName", "setImageUrl");
        object.put("imageUrl", "IMAGE_URL");
        s_connection.send(new Gson().toJson(object));
        System.out.println("Opened WebSocket Connection");
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {

    }
}
