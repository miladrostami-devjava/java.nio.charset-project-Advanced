package com.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NetworkEncodingDemo {

    public static void main(String[] args) {
try(ServerSocket serverSocket = new ServerSocket(6666)){

    Socket clientServer = serverSocket.accept();
    BufferedReader in = new BufferedReader(new InputStreamReader( clientServer.getInputStream(), StandardCharsets.UTF_8));
    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientServer.getOutputStream(),StandardCharsets.UTF_8));

    String inputLine;
    while ((inputLine = in.readLine()) != null){
        System.out.println("Received: " + inputLine) ;
        out.write(inputLine);
        out.newLine();
        out.flush();
    }


} catch (IOException e) {
    throw new RuntimeException(e);
}


    }


}
