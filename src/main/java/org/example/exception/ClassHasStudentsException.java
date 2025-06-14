package org.example.exception;

public class ClassHasStudentsException extends RuntimeException{
    public ClassHasStudentsException(String message) {
        super(message);
    }
}
