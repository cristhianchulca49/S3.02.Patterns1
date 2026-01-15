package Level2.Countries.Usa;

import Level2.Interfaces.Address;
import Level2.Interfaces.ContactFactory;
import Level2.Interfaces.Phone;

record UsaContactFactory (String street, String city, String zipCode, String phone) implements ContactFactory {
    @Override
    public Address createAddressFormat() {
        return new UsaAddress(street, city, zipCode);
    }

    @Override
    public Phone createPhoneFormat() {
        return new UsaPhone(phone);
    }
}
