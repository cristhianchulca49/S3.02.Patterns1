package Level3.Strategies;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class HtmlReportStrategy implements ReportStrategy {
    @Override
    public String generate(List<ReportData> data) {
        return "<table>" + data.stream()
                .map(d -> "<tr><td>" + d.id() + "</td><td>" + d.name() + "</td></tr>")
                .collect(Collectors.joining()) + "</table>";
    }
}