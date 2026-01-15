package Level3.Services;

import Level3.Domain.ReportData;
import Level3.Domain.ReportStrategy;

import java.util.List;

public class ReportServices {
    private ReportStrategy reportStrategy;

    public ReportServices(ReportStrategy strategy) {
        this.reportStrategy = strategy;
    }

    public void setStrategy(ReportStrategy strategy) {
        this.reportStrategy = strategy;
    }

    public String generateReport(List<ReportData> data) {
        return reportStrategy.generate(data);
    }
}
