package Angel.app.services;
import Angel.app.Interfaces.EntryManager;
import Angel.app.models.WorkReportEntry;
import lombok.var;

import java.util.*;
import java.util.stream.Collectors;


public class WorkReport implements EntryManager<WorkReportEntry> {
    private List<WorkReportEntry> entries;

    public WorkReport() {
        this.entries= new ArrayList<WorkReportEntry>();
    }

    public void AddEntry(WorkReportEntry entry) {
        entries.add(entry);
    }

    public void RemoveEntryAt(int index) {
        entries.remove(index);

    }

    public void getEntry(int index) {
       var entry = entries.get(index);

        System.out.println(
                "Codigo:"+entry.getProjectCode()
                +"Nombre:"+entry.getProjectName()
                + "Spent Hours:" + entry.getSpentHours());

    }

    @Override
    public String toString() {
        return entries.stream()
                .map(x -> "Code: " + x.getProjectCode()
                        + ", Name: " + x.getProjectName()
                        + ", Hours: " + x.getSpentHours())
                .collect(Collectors.joining(System.lineSeparator()));
    }



}
