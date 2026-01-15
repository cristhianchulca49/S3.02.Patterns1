package Level2.Products.Usa;

import Level2.Products.Address;

record UsaAddress(String street, String city, String zipCode) implements Address {
    @Override
    public String formatAddress() {
        return String.format("%s, %s, %s", street, city, zipCode);
    }
}
