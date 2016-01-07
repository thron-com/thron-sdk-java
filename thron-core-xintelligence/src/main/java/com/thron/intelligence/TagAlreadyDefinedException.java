package com.thron.intelligence;

public class TagAlreadyDefinedException extends Exception {
    public TagAlreadyDefinedException() {
        super();
    }

    public TagAlreadyDefinedException(String s) {
        super(s);
    }
}
