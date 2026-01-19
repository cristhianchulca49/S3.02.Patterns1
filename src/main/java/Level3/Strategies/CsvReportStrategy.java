package Level3.Strategies;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class CsvReportStrategy implements ReportStrategy {
    @Override
    public String generate(List<ReportData> data) {
        String header = "ID, Name\n";
        String rows = data.stream()
                .map(d -> String.join(",", d.id(), d.name()))
                .collect(Collectors.joining("\n"));
        return header + rows;
    }
}