package com.cape.lib.management.system.exception;

public class UnhadledException extends Exception {
    public UnhadledException(String message, Exception e) {
        super(message,e);
    }
}
