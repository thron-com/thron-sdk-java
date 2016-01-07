package it.newvision.nvp.xadmin;

/**
 *
 * @author emanuele.bragagnolo
 */
public class AppNotFoundException extends Exception {
    public AppNotFoundException() {
           super();
       }

       public AppNotFoundException(String s) {
           super(s);
       }
}
