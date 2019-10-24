import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExportData {

    /**
     * Export sorted data as a text file
     * @param data Text be exported into the text file
     * @param filepath File should be called SortedOutput.txt
     */
    public static void saveToFile(String data, File filepath){
        try {
            FileWriter writer = new FileWriter(filepath);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
