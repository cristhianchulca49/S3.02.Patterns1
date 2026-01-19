package Level3.Strategies;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class XmlReportStrategy implements ReportStrategy {
    @Override
    public String generate(List<ReportData> data) {
        return "<report>" + data.stream()
                .map(d -> "<item>" +
                        "<id>" + d.id() + "</id>" +
                        "<name>" + d.name() + "</name>" +
                        "</item>")
                .collect(Collectors.joining()) + "</report>";
    }
}
