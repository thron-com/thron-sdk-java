package it.newvision.nvp.xadmin;

/**
 * Created by IntelliJ IDEA.
 * User: flavio.alberti
 * Date: 03/03/11
 * Time: 10.31
 * To change this template use File | Settings | File Templates.
 */
public class InvalidStatusException extends Exception{
    public InvalidStatusException(String message) {
        super(message);
    }

    public InvalidStatusException() {
        super();
    }
}
