package Level2.Products.Usa;

import Level2.Products.Address;

public class UsaAddress implements Address {
    @Override
    public String formatAddress(String address, String city, String postalCode) {
        return String.format("%s, %s, %s", address, city, postalCode);
    }
}
