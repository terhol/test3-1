package se.terhol.pisemka31;

/**
 * Vendor does not sell required ice cream.
 *
 * @author Radek Oslejsek
 * @version 2010-12-18
 */
public class UnknownIceCreamException extends IceCreamException {
    /**
     * Creates a new instance of <code>UnknownIceCreamException</code> without detail message.
     *
     * @param iceCream Ice cream.
     */
    public UnknownIceCreamException(IceCream iceCream) {
        super("Unknown ice cream ", iceCream);
    }
}
