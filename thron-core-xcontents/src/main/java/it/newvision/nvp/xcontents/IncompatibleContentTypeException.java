package it.newvision.nvp.xcontents;

public class IncompatibleContentTypeException extends Exception {
    public IncompatibleContentTypeException(String msg) {
        super(msg);
    }

    public IncompatibleContentTypeException() {
        super();
    }
}