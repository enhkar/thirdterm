package ru.kucheryavyy.MyThirdTestAppSpringBoot.exception;

public class ValidationFailedException extends Exception{

    public ValidationFailedException(String message) {
        super(message);
    }
}
