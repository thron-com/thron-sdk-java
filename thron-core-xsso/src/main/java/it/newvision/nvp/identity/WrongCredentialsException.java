/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.newvision.nvp.identity;

/**
 *
 * @author daniele.bettella
 */
public class WrongCredentialsException extends Exception {

    public WrongCredentialsException() {
        super();
    }

    public WrongCredentialsException(String s) {
        super(s);

    }
}
