package Level2.Products.Spain;

import Level2.Products.Address;

record SpainAddress(String street, String city, String zipCode) implements Address {
    @Override
    public String formatAddress() {
        return String.format("%s, %s %s", street, city, zipCode);
    }
}
