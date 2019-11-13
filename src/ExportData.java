import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportData {
    /**
     * Export sorted data as a text file
     *
     * @param filePath    file path of export file. It will overwrite/create a new file
     * @param allStudents list of students to be printed
     * @param sortType    how was the students sorted?
     */
    public static void saveToFile(File filePath, ArrayList<Student> allStudents, String sortType) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
            writer.write(sortType);
            writer.write("\n");
            for (int i = 0; i < Student.allStudents.size(); i++) {
                writer.append(allStudents.get(i).getLastName());
                writer.append(" ");
                writer.append(allStudents.get(i).getFirstName());
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getSID()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getMathScore()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getScienceScore()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getSocialStudiesScore()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getLanguageArtsScore()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getComputerScienceScore()));
                writer.append(" ");
                writer.append(Integer.toString(allStudents.get(i).getTotalScorePercentage()));
                writer.append(" ");
                writer.append(allStudents.get(i).getTotalScoreLetterGrade());
                writer.append("\n");
            }
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Create or override existing file.
     *
     * @param filePath path of output file
     */
    public static void createFile(File filePath) {
        FileWriter writer;
        try {
            writer = new FileWriter(filePath);
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

