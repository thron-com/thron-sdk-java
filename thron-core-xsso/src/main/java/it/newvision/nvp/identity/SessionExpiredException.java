/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.newvision.nvp.identity;

/**
 *
 * @author daniele.bettella
 */
public class SessionExpiredException extends Exception {

    public SessionExpiredException() {
        super();
    }

    public SessionExpiredException(String s) {
        super(s);

    }
}
