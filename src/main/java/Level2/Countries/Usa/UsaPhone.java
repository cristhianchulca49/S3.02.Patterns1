package Level2.Countries.Usa;

import Level2.Interfaces.Phone;

record UsaPhone(String phone) implements Phone {
    @Override
    public String formatPhone() {
        return String.format("+1 (0%s) %s-%s",
                phone.substring(0, 2),
                phone.substring(2, 5),
                phone.substring(5, 9));
    }
}
