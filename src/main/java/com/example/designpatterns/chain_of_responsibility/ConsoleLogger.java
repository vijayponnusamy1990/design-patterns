package com.example.designpatterns.chain_of_responsibility;

public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger::write::"+message);
    }
}
