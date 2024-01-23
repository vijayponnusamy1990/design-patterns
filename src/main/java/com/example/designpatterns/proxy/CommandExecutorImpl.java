package com.example.designpatterns.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{

    @Override
    public void executeCommand(String command) throws IOException {
        Runtime.getRuntime().exec(command);
        System.out.println(command+" executed successfully");
    }
}
