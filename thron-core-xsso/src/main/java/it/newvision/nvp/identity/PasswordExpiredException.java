/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.newvision.nvp.identity;

/**
 *
 * @author domenico.stragliotto
 */
public class PasswordExpiredException extends Exception {

    public PasswordExpiredException() {
        super();
    }

    public PasswordExpiredException(String s) {
        super(s);

    }
}
