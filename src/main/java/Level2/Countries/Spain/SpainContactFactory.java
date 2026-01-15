package Level2.Countries.Spain;

import Level2.Interfaces.ContactFactory;
import Level2.Interfaces.Address;
import Level2.Interfaces.Phone;


record SpainContactFactory(String street, String city, String zipCode, String phone) implements ContactFactory {

    @Override
    public Address createAddressFormat() {
        return new SpainAddress(street, city, zipCode);
    }

    @Override
    public Phone createPhoneFormat() {
        return new SpainPhone(phone);
    }
}
