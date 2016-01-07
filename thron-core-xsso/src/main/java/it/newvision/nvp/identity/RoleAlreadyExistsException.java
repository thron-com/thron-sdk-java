package it.newvision.nvp.identity;

public class RoleAlreadyExistsException extends Exception {
    public RoleAlreadyExistsException() {
           super();
       }

       public RoleAlreadyExistsException(String s) {
           super(s);
       }
}
