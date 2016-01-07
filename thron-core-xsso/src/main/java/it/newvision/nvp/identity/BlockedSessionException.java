package it.newvision.nvp.identity;

public class BlockedSessionException extends Exception {

    public String username;
    public Integer counter;


    public BlockedSessionException() {
        super();
    }

    public BlockedSessionException(String s) {
        super(s);

    }

    public BlockedSessionException(String user, Integer count) {
        super();
        username = user;
        counter = count;

    }
}
