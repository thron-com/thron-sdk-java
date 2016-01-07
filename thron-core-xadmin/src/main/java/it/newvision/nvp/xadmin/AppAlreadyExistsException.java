package it.newvision.nvp.xadmin;

/**
 * @author emanuele.bragagnolo
 */
public class AppAlreadyExistsException extends Exception {
    public AppAlreadyExistsException() {
        super();
    }

    public AppAlreadyExistsException(String s) {
        super(s);
    }
}
