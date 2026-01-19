package Level3;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;
import Level3.Services.ReportServices;
import Level3.Strategies.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStrategy {
    private ReportServices reportServices;
    private List<ReportData> testData;

    @BeforeEach
    void setUp() {
        testData = List.of(
                new ReportData("101", "Laptop HP Pavilion"),
                new ReportData("102", "Mouse Óptico Inalámbrico"),
                new ReportData("103", "Monitor 24'' Full HD")
        );
    }

    @ParameterizedTest
    @MethodSource("reportProvider")
    void testGenerateReport(ReportStrategy strategy, String expected) {
        reportServices = new ReportServices(strategy);
        String actual = reportServices.generateReport(testData);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> reportProvider() {
        return Stream.of(
                Arguments.of(new JsonReportStrategy(),
                        "[{\"id\":\"101\", \"name\":\"Laptop HP Pavilion\"}, " +
                                "{\"id\":\"102\", \"name\":\"Mouse Óptico Inalámbrico\"}, " +
                                "{\"id\":\"103\", \"name\":\"Monitor 24'' Full HD\"}]"),

                Arguments.of(new CsvReportStrategy(),
                        "ID, Name\n101,Laptop HP Pavilion\n" +
                                "102,Mouse Óptico Inalámbrico\n103,Monitor 24'' Full HD"),

                Arguments.of(new XmlReportStrategy(),
                        "<report><item><id>101</id><name>Laptop HP Pavilion</name></item>" +
                                "<item><id>102</id><name>Mouse Óptico Inalámbrico</name></item>" +
                                "<item><id>103</id><name>Monitor 24'' Full HD</name></item></report>"),

                Arguments.of(new HtmlReportStrategy(),
                        "<table><tr><td>101</td><td>Laptop HP Pavilion</td></tr>" +
                                "<tr><td>102</td><td>Mouse Óptico Inalámbrico</td></tr>" +
                                "<tr><td>103</td><td>Monitor 24'' Full HD</td></tr></table>"),

                Arguments.of(new PdfReportStrategy(),
                        "PDF DOCUMENT\nId: 101, Name: Laptop HP Pavilion\n" +
                                "Id: 102, Name: Mouse Óptico Inalámbrico\n" +
                                "Id: 103, Name: Monitor 24'' Full HD"),

                Arguments.of(new WordReportStrategy(),
                        "WORD DOCUMENT\nId: 101, Name: Laptop HP Pavilion\n" +
                                "Id: 102, Name: Mouse Óptico Inalámbrico\n" +
                                "Id: 103, Name: Monitor 24'' Full HD"),

                Arguments.of(new ExcelReportStrategy(),
                        "EXCEL DOCUMENT\nId: 101, Name: Laptop HP Pavilion\n" +
                                "Id: 102, Name: Mouse Óptico Inalámbrico\n" +
                                "Id: 103, Name: Monitor 24'' Full HD")
        );
    }
}