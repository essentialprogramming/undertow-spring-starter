package com.server;

import com.undertow.standalone.UndertowServer;
import javax.servlet.ServletException;
import static com.util.cloud.DeploymentConfiguration.getProperty;

public class Server {

    public static void main(String[] args)
            throws ServletException {

        final String  host = getProperty("undertow.host", "0.0.0.0");
        final Integer port = getProperty("undertow.port", 8080);

        final UndertowServer server = new UndertowServer(host, port, "essentialProgramming.jar");
        server.start();

    }
}
