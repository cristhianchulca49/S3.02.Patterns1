package Level2;

import Level2.Client.Contact;
import Level2.Countries.Spain.SpainContactFactory;
import Level2.Countries.Usa.UsaContactFactory;
import Level2.Interfaces.ContactFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContact {

    @ParameterizedTest
    @MethodSource("provideFactoriesAndExpectedOutputs")
    void testContactFormatting(ContactFactory factory, String expectedOutput) {

        Contact contact = new Contact(factory);

        assertEquals(expectedOutput, contact.toString());
    }

    private static Stream<Arguments> provideFactoriesAndExpectedOutputs() {
        return Stream.of(
                Arguments.of(
                        new SpainContactFactory("Carrer Major 34", "Barcelona", "08001", "623456789"),
                        "Address: Carrer Major 34, 08001 Barcelona | Phone: +34 623 45 67 89"
                ),
                Arguments.of(
                        new UsaContactFactory("154 5th Avenue", "New York", "NY 10001", "987654321"),
                        "Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 (987) 654-321"
                ),
                Arguments.of(
                        new SpainContactFactory("Calle de Alcalá 1", "Madrid", "28014", "912345678"),
                        "Address: Calle de Alcalá 1, 28014 Madrid | Phone: +34 912 34 56 78"
                ),
                Arguments.of(
                        new UsaContactFactory("1600 Pennsylvania Avenue NW", "Washington", "DC 20500", "202456111"),
                        "Address: 1600 Pennsylvania Avenue NW, Washington, DC 20500 | Phone: +1 (202) 456-111"
                ),
                Arguments.of(
                        new SpainContactFactory("Avenida de la Constitución 5", "Sevilla", "41004", "712345678"),
                        "Address: Avenida de la Constitución 5, 41004 Sevilla | Phone: +34 712 34 56 78"
                ),
                Arguments.of(
                        new UsaContactFactory("742 Evergreen Terrace", "Springfield", "IL 62704", "939555011"),
                        "Address: 742 Evergreen Terrace, Springfield, IL 62704 | Phone: +1 (939) 555-011"
                )
        );
    }
}
