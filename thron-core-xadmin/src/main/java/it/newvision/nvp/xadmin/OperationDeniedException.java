package it.newvision.nvp.xadmin;

public class OperationDeniedException extends Exception {
    public OperationDeniedException(String message) {
        super(message);
    }

    public OperationDeniedException() {
        super();
    }
}
