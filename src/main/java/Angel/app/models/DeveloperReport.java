package Angel.app.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeveloperReport {
    private int id;
    private String name;
    private String level;
    private int workingHours;
    private double hourlyRate;
}
