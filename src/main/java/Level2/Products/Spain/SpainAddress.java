package Level2.Products.Spain;

import Level2.Products.Address;

public class SpainAddress implements Address {
    @Override
    public String formatAddress(String  address,  String city, String postalCode) {
        return String.format("%s, %s %s", address, city, postalCode);
    }
}
