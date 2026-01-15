package Level2.Products.Spain;

import Level2.Products.Phone;

record SpainPhone(String phone) implements Phone {
    @Override
    public String formatPhone() {
        return String.format("+34 %s %s %s %s",
                phone.substring(0, 3),
                phone.substring(3, 5),
                phone.substring(5, 7),
                phone.substring(7, 9)
        );
    }
}
