/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.identity;

/**
 * @author andrea.delia
 */
public class UserTypeNotValidException extends Exception {
    public UserTypeNotValidException() {
        super();
    }

    public UserTypeNotValidException(String s) {
        super(s);
    }
}
