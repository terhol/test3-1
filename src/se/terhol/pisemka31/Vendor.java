package se.terhol.pisemka31;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Ice cream vendor.
 *
 * @author Radek Oslejsek
 * @version 2010-12-17
 */
public interface Vendor {
    /**
     * Sells required portions of ice cream to customer (and reduces available portions).
     *
     * @param iceCream Ice cream to sell
     * @param required Number of required portions
     * @throws IllegalArgumentException If the "required" paramater is <= 0
     * @throws UnknownIcecreamException If this vendor does not sell this type of ice cream
     * @throws OutOfStockException      If there is not enough portions available
     */
    void sell(IceCream iceCream, int required) throws IceCreamException;

    /**
     * Restocks the ice cream (either adds a new type of ice cream or increases number of
     * available portions of existing ice cream).
     *
     * @param iceCream Ice cream, must not be null
     * @param quantity Number of new portions >= 0
     * @throws NullPointerException     if iceCream parameter is null
     * @throws IllegalArgumentException if quantity parameter is less than zero
     */
    void restock(IceCream iceCream, int quantity);

    /**
     * Writes ice creams to given output stream as follow:
     * 1. Data are writen in text mode.
     * 2. Each ice cream is written to a single line.
     * 3. Ice creams are written according to their natural ordering.
     * 4. Each line consists of ice cream czech name, english name and number of potions
     * (in this order) separated by colon ':'.
     *
     * @param OutputStream os
     * @throws IOException on I/O failure
     */
    void save(OutputStream os) throws IOException;
}
