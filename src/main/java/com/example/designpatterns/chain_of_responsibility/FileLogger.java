package com.example.designpatterns.chain_of_responsibility;

public class FileLogger extends AbstractLogger{

    public FileLogger(int logLevel){
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger::write::"+message);
    }
}
