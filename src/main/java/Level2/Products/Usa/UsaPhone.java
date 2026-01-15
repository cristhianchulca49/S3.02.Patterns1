package Level2.Products.Usa;

import Level2.Products.Phone;

record UsaPhone(String phone) implements Phone {
    @Override
    public String formatPhone() {
        return String.format("+1 (0%s) %s-%s",
                phone.substring(0, 2),
                phone.substring(2, 5),
                phone.substring(5, 9));
    }
}
