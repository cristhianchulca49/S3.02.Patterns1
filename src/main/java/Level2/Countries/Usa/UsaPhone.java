package Level2.Countries.Usa;

import Level2.Interfaces.Phone;

record UsaPhone(String phone) implements Phone {
    @Override
    public String formatPhone() {
        return String.format("+1 (%s) %s-%s",
                phone.substring(0, 3),
                phone.substring(3, 6),
                phone.substring(6, 9));
    }
}
