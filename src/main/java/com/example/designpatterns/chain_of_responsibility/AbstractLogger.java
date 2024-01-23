package com.example.designpatterns.chain_of_responsibility;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    protected AbstractLogger nextLogger;
    protected  int logLevel;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(logLevel <= level ){
            write(message);
        }
        if(this.nextLogger != null){
            this.nextLogger.write(message);
        }
    }

    abstract protected  void write(String message);
}
