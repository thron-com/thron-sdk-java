/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.newvision.nvp.xcontents;

/**
 *
 * @author leonardo.scattola
 */
public class PrettyidAlreadyExistException extends Exception {
    public PrettyidAlreadyExistException(String msg) {
        super(msg);
    }

    public PrettyidAlreadyExistException() {
        super();
    }
}
