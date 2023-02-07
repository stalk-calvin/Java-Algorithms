package org.calvin.String;

import org.calvin.String.websocket.WebSocketServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.websocket.RemoteEndpoint;
import javax.websocket.Session;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WebSocketServerTest {

    @Mock
    private Session session1;

    @Mock
    private Session session2;

    @Test
    public void shouldOpen() {
        WebSocketServer server = new WebSocketServer();
        server.onOpen(session1);
        server.onOpen(session2);
        Assertions.assertEquals(2, server.clients.size());
    }

    @Test
    public void shouldClose() {
        WebSocketServer server = new WebSocketServer();
        server.onOpen(session1);
        server.onOpen(session2);
        server.onClose(session1);
        Assertions.assertEquals(1, server.clients.size());
        assertTrue(server.clients.contains(session2));
    }

    @Test
    public void shouldSendMessage() throws IOException {
        final RemoteEndpoint.Basic endpoint = mock(RemoteEndpoint.Basic.class);
        WebSocketServer server = new WebSocketServer();
        server.onOpen(session1);
        when(session2.getBasicRemote()).thenReturn(endpoint);
        doNothing().when(endpoint).sendText(anyString());
        server.onOpen(session2);
        server.onMessage("Hello World!", session1);
        verify(session2.getBasicRemote(), times(1)).sendText("Hello World!");
    }

    @Test
    public void shouldNotSendMessage() throws IOException {
        final RemoteEndpoint.Basic endpoint = mock(RemoteEndpoint.Basic.class);
        WebSocketServer server = new WebSocketServer();
        server.onOpen(session1);
        when(session2.getBasicRemote()).thenReturn(endpoint);
        doThrow(IOException.class).when(endpoint).sendText(anyString());
        server.onOpen(session2);
        Exception exception =
                assertThrows(Exception.class, () ->
                    server.onMessage("Hello World!", session1));

        verify(session2.getBasicRemote(), times(1)).sendText("Hello World!");
        assertEquals("Failed to send message to session null", exception.getMessage());
    }
}