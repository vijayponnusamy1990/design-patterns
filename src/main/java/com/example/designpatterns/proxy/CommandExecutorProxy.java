package com.example.designpatterns.proxy;

import java.io.IOException;

public class CommandExecutorProxy implements  CommandExecutor{

    private CommandExecutor commandExecutor;

    private boolean isAdmin;

    public CommandExecutorProxy (String userId, String password){
        if("admin".equals(userId) && "admin123".equals(password)){
            isAdmin = true;
        }
    }


    @Override
    public void executeCommand(String command) throws IOException {
        if(commandExecutor == null){
            commandExecutor = new CommandExecutorImpl();
        }
        if(isAdmin){
            commandExecutor.executeCommand(command);
        }else{
            if(command.startsWith("rm")){
                System.out.println("User does not have access to execute "+ command);
            }else{
                commandExecutor.executeCommand(command);
            }
        }
    }
}
