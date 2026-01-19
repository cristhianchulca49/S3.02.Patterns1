package Level3.Strategies;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class JsonReportStrategy implements ReportStrategy {
    @Override
    public String generate(List<ReportData> data) {
        return data.stream()
                .map(d -> String.format("{\"id\":\"%s\", \"name\":\"%s\"}", d.id(), d.name()))
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
