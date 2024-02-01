package JBDL.L2.gfg.exceptions;

public class ProductNotFoundException extends Exception{

    private Integer requestedProductId;

    public ProductNotFoundException(String message, Integer requestedProductId) {
        super(message);
        this.requestedProductId = requestedProductId;
    }
}
