package com.example.designpatterns.chain_of_responsibility;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger::write::"+message);
    }
}
