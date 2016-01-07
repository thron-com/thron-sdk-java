package it.newvision.nvp.identity;

public class AclNotFoundException extends Exception {
    public AclNotFoundException(String msg) {
           super(msg);
       }

       public AclNotFoundException() {
           super();
       }
}
