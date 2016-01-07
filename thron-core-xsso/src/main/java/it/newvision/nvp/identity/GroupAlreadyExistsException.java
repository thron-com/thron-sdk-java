/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.identity;

/**
 *
 * @author andrea.delia
 */
public class GroupAlreadyExistsException extends Exception{
    public GroupAlreadyExistsException() {
           super();
       }

       public GroupAlreadyExistsException(String s) {
           super(s);
       }
}
