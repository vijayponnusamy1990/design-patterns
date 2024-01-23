package com.example.designpatterns.proxy;

import java.io.IOException;

public class ProxyClient {
    public static void main(String[] args) throws IOException {
        CommandExecutor commandExecutor = new CommandExecutorProxy("admin", "admin123");
        commandExecutor.executeCommand("rm -rf abc.pdf");

        commandExecutor = new CommandExecutorProxy("david", "admin123");
        commandExecutor.executeCommand("rm -rf abc.pdf");
    }
}
