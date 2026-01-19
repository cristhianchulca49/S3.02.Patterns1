package Level3.Strategies;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class WordReportStrategy implements ReportStrategy {
    @Override
    public String generate(List<ReportData> data) {
        String header = "WORD DOCUMENT\n";
        String body = data.stream()
                .map(d -> String.format("Id: %s, Name: %s", d.id(), d.name()))
                .collect(Collectors.joining("\n"));

        return header + body;
    }

}
