package Angel.app;

import Angel.app.models.ScheduleTask;
import Angel.app.models.WorkReportEntry;
import Angel.app.services.FileSaver;
import Angel.app.services.Scheduler;
import Angel.app.services.WorkReport;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WorkReportEntry entry = new WorkReportEntry();
        entry.setProjectCode("C1");
        entry.setProjectName("Principios Solid");
        entry.setSpentHours(4);

        WorkReportEntry entry2 = new WorkReportEntry();
        entry2.setProjectCode("C2");
        entry2.setProjectName("Patrones de diseno");
        entry2.setSpentHours(4);

        WorkReport workRpt = new WorkReport();
        workRpt.AddEntry(entry);
        workRpt.AddEntry(entry2);

        ScheduleTask task = new ScheduleTask();
        task.setTaskId(1);
        task.setContent("Do something now.");
        task.setExecuteOn(LocalDateTime.now().plusDays(5));

        Scheduler schedule = new Scheduler();
        schedule.AddEntry(task);

        String dir = ConfigLoader.get("app.directoryPath");
        String file = ConfigLoader.get("app.fileName");

        FileSaver saver = new FileSaver();
        saver.saveToFile(dir,file,workRpt);
        saver.saveToFile(dir,"schedule.txt",schedule);
        System.out.println(workRpt.toString());

    }
}