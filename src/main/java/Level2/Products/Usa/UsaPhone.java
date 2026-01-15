package Level2.Products.Usa;

import Level2.Products.Phone;

public class UsaPhone implements Phone {
    @Override
    public String formatPhone(String phone) {
        return String.format("+1 (0%s) %s-%s",
                phone.substring(0, 2),
                phone.substring(2, 5),
                phone.substring(5, 9));
    }
}
