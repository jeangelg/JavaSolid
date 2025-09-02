package Angel.app.services;
import Angel.app.Interfaces.EntryManager;
import Angel.app.models.ScheduleTask;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Scheduler implements EntryManager<ScheduleTask> {

    private List<ScheduleTask> scheduleTasks;

    public Scheduler() {
        this.scheduleTasks= new ArrayList<ScheduleTask>();
    }

    public void AddEntry(ScheduleTask entry) {
        scheduleTasks.add(entry);
    }

    public void RemoveEntryAt(int index) {
        scheduleTasks.remove(index);

    }


    @Override
    public String toString() {
        return scheduleTasks.stream()
                .map(x -> "Task Id: " + x.getTaskId()
                        + ", Content: " + x.getContent()
                        + ", Executed On: " + x.getExecuteOn())
                .collect(Collectors.joining(System.lineSeparator()));
    }

}
