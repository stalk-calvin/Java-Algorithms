package org.calvin.String.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint("/websocket")
public class WebSocketServer {

    public final Set<Session> clients = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        clients.add(session);
        System.out.println("Session opened: " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        clients.remove(session);
        System.out.println("Session closed: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("Received message from session " + session.getId() + ": " + message);
        synchronized (clients) {
            for (Session client : clients) {
                if (!client.equals(session)) {
                    try {
                        client.getBasicRemote().sendText(message);
                        System.out.println("Sent message to session " + client.getId());
                    } catch (IOException e) {
                        throw new IOException("Failed to send message to session " + client.getId());
                    }
                }
            }
        }
    }
}
