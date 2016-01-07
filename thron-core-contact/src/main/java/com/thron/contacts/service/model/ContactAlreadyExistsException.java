package com.thron.contacts.service.model;

public class ContactAlreadyExistsException extends Exception {

    public ContactAlreadyExistsException() {
    }

    public ContactAlreadyExistsException(String s) {
        super(s);
    }


}
