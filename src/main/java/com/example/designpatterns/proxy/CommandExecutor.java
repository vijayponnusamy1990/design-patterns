package com.example.designpatterns.proxy;

import java.io.IOException;

public interface CommandExecutor {

    public void executeCommand(String command) throws IOException;
}
