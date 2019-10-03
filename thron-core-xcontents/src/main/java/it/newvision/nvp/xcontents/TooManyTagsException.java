/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.newvision.nvp.xcontents;

/**
 *
 * @author leonardo.scattola
 */
public class TooManyTagsException extends Exception {
    public TooManyTagsException(String msg) {
        super(msg);
    }

    public TooManyTagsException() {
        super();
    }
}
