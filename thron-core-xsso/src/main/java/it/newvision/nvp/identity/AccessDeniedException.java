package it.newvision.nvp.identity;

public class AccessDeniedException extends Exception {
    public AccessDeniedException(String msg) {
           super(msg);
       }

       public AccessDeniedException() {
           super();
       }
}
