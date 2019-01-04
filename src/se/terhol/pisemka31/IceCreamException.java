package se.terhol.pisemka31;

/**
 * Exceptions related to selling ice cream.
 *
 * @author Radek Oslejsek
 * @version 2010-12-17
 */
public class IceCreamException extends Exception {
    private IceCream iceCream;

    /**
     * Creates a new instance of <code>IceCreamException</code> without detail message.
     *
     * @param iceCream Ice cream.
     */
    public IceCreamException(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    /**
     * Constructs an instance of <code>IceCreamException</code> with the specified detail message.
     *
     * @param msg      the detail message.
     * @param iceCream Ice cream.
     */
    public IceCreamException(String msg, IceCream iceCream) {
        super(msg);
        this.iceCream = iceCream;
    }
}