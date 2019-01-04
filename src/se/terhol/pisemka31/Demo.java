package se.terhol.pisemka31;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Write a description of class Demo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo {
    public static void main(String[] args) throws IOException, IceCreamException {
        Vendor vendor = new VendorImpl();

        vendor.restock(new IceCream("cokoladova", "chocolade"), 20);
        vendor.restock(new IceCream("bananova", "banana"), 20);
        vendor.restock(new IceCream("jahodova", "strawberry"), 20);
        vendor.restock(new IceCream("rumova", "de luxe"), 10);
        vendor.restock(new IceCream("vanilkova", "vanilla"), 20);
        vendor.sell(new IceCream("vanilkova", "vanilla"), 10);
        vendor.restock(new IceCream("vanilkova", "vanilla"), 20);

        FileOutputStream os = new FileOutputStream("vendor-out.txt");
        try {
            vendor.save(os);
        } finally {
            os.close();
        }
    }
}
