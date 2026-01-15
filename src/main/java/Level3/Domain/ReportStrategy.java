package Level3.Domain;

import java.util.List;

public interface ReportStrategy {
    <T> void generate(List<T> data);
}
