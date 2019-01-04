package se.terhol.pisemka31;

/**
 * Ice cream is not in the stock in required quantity.
 *
 * @author Radek Oslejsek
 * @version 2010-12-18
 */
public class OutOfStockException extends IceCreamException {
    private int required;
    private int available;

    /**
     * Creates a new instance of <code>OutOfStockException</code> without detail message.
     *
     * @param icecream  Ice cream.
     * @param required  number of required pieces
     * @param available number of pieces available in the stock
     */
    public OutOfStockException(IceCream iceCream, int required, int available) {
        super("Out of stock", iceCream);
        this.required = required;
        this.available = available;
    }
}
