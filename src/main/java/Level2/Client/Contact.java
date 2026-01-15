package Level2.Client;

import Level2.Interfaces.Address;
import Level2.Interfaces.ContactFactory;
import Level2.Interfaces.Phone;

public class Contact {
    private final Address address;
    private final Phone phone;

    public Contact(ContactFactory contactFactory) {
        address = contactFactory.createAddressFormat();
        phone = contactFactory.createPhoneFormat();
    }

    @Override
    public String toString() {
        return String.format("Address: %s | Phone: %s",
                address.formatAddress(),
                phone.formatPhone());
    }

}
