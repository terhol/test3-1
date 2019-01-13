package se.terhol.pisemka31;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Tereza Holm
 */
public class VendorImpl implements Vendor {
    SortedMap<IceCream, Integer> iceCreams = new TreeMap<>();

    @Override
    public void sell(IceCream iceCream, int required) throws IceCreamException {
        if (required < 0) {
            throw new IllegalArgumentException();
        }
        if (!iceCreams.containsKey(iceCream)) {
            throw new UnknownIceCreamException(iceCream);
        }
        if (iceCreams.get(iceCream) < required) {
            throw new OutOfStockException(iceCream, required, iceCreams.get(iceCream));
        }
        int newAmount = iceCreams.get(iceCream) - required;
        iceCreams.put(iceCream, newAmount);
    }

    @Override
    public void restock(IceCream iceCream, int quantity) {
        if (iceCream == null) {
            throw new NullPointerException();
        }
        if (quantity < 0) {
            throw new IllegalArgumentException();
        }
        if (iceCreams.containsKey(iceCream)) {
            int newQuantity = iceCreams.get(iceCream) + quantity;
            iceCreams.put(iceCream, newQuantity);
        } else {
            iceCreams.put(iceCream, quantity);
        }
    }

    @Override
    public void save(OutputStream os) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
        for (IceCream iceCream : iceCreams.keySet()) {
            writer.write(iceCream.getCzechName() + ":" + iceCream.getEnglishName() + ":" + iceCreams.get(iceCream));
            writer.newLine();
            writer.flush();
        }
    }
}


