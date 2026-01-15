package Level3.Domain;

import java.util.List;

public interface ReportStrategy {
    String generate(List<ReportData> data);
}
