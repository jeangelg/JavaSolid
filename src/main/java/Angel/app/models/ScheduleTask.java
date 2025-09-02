package Angel.app.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleTask
{
    private int taskId;
    private String content;
    private LocalDateTime executeOn;
}