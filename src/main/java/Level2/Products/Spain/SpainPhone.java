package Level2.Products.Spain;

import Level2.Products.Phone;

public class SpainPhone implements Phone {
    @Override
    public String formatPhone(String phone) {
        return String.format("+34 %s %s %s %s",
                phone.substring(0, 3),
                phone.substring(3, 5),
                phone.substring(5, 7),
                phone.substring(7, 9)
        );
    }
}
