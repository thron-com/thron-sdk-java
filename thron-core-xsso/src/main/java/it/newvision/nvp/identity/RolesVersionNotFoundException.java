package it.newvision.nvp.identity;

public class RolesVersionNotFoundException extends Exception {
    public RolesVersionNotFoundException(String msg) {
           super(msg);
       }

       public RolesVersionNotFoundException() {
           super();
       }
}
