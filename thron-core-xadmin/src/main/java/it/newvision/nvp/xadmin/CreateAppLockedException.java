package it.newvision.nvp.xadmin;

/**
 * Created by IntelliJ IDEA.
 * User: flavio.alberti
 * Date: 03/03/11
 * Time: 10.31
 * To change this template use File | Settings | File Templates.
 */
public class CreateAppLockedException extends Exception{
    public CreateAppLockedException(String message) {
        super(message);
    }

    public CreateAppLockedException() {
        super();
    }
}
