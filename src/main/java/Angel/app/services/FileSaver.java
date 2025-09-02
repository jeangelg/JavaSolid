package Angel.app.services;

import Angel.app.Interfaces.EntryManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class FileSaver {

    public <T> void saveToFile (String directoryPath, String fileName, EntryManager<T> workReport) {
        try {

            File directory = new File(directoryPath);
            if (!directory.exists()) {
                directory.mkdirs();
            }

            String filePath = Paths.get(directoryPath, fileName).toString();

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(workReport.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
