/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.newvision.nvp.identity;


public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException() {
           super();
       }

       public UserAlreadyExistsException(String s) {
           super(s);
       }
}
