package it.newvision.nvp.identity;

public class ExternalIdAlreadyExistsException extends Exception {
    public ExternalIdAlreadyExistsException() {
        super();
    }

    public ExternalIdAlreadyExistsException(String s) {
        super(s);
    }
}
