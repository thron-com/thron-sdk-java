/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.identity;

/**
 * @author andrea.delia
 */
public class UserGroupTypeNotMatchException extends Exception {
    public UserGroupTypeNotMatchException() {
        super();
    }

    public UserGroupTypeNotMatchException(String s) {
        super(s);
    }
}
