package Level2.Client;

import Level2.Interfaces.Address;
import Level2.Interfaces.ContactFactory;
import Level2.Interfaces.Phone;

public class Contact {
    Address address;
    Phone phone;

    Contact(ContactFactory contactFactory) {
        address = contactFactory.createAddressFormat();
        phone = contactFactory.createPhoneFormat();
    }
}
