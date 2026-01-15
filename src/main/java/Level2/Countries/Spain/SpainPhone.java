package Level2.Countries.Spain;

import Level2.Interfaces.Phone;

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
