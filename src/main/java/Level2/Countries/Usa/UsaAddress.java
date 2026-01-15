package Level2.Countries.Usa;

import Level2.Interfaces.Address;

record UsaAddress(String street, String city, String zipCode) implements Address {
    @Override
    public String formatAddress() {
        return String.format("%s, %s, %s", street, city, zipCode);
    }
}
