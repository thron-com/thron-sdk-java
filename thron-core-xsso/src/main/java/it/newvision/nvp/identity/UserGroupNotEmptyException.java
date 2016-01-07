/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.identity;

/**
 * @author andrea.delia
 */
public class UserGroupNotEmptyException extends Exception {
    public UserGroupNotEmptyException() {
        super();
    }

    public UserGroupNotEmptyException(String s) {
        super(s);
    }
}
