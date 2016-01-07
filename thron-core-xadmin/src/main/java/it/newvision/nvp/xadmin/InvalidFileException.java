package it.newvision.nvp.xadmin;

public class InvalidFileException extends Exception{
    public InvalidFileException(String message) {
        super(message);
    }

    public InvalidFileException() {
        super();
    }
}
