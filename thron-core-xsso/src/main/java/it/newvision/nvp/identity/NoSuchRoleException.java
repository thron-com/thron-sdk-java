package it.newvision.nvp.identity;

public class NoSuchRoleException extends Exception {
    public NoSuchRoleException(String msg) {
           super(msg);
       }

       public NoSuchRoleException() {
           super();
       }
}
