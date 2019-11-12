
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportData {

    /**
     * Export sorted data as a text file
     * @param data Text be exported into the text file
     * @param filepath File should be called SortedOutput.txt
     */
	

	public static void saveToFile(File filePath, ArrayList<Student> allStudents, String sortType){
        try {
        	PrintWriter writer = new PrintWriter(new FileWriter(filePath, true));
            writer.write(sortType);
            writer.write("\n");
           for(int i = 0; i< Student.allStudents.size();i++) {
        	   writer.append(allStudents.get(i).getLastName());
        	   writer.append(" ");
        	   writer.append(allStudents.get(i).getFirstName());
        	   writer.append(" ");
        	   writer.append(Integer.toString(allStudents.get(i).getSID()));
        	   writer.append(" ");
        	   writer.append(Integer.toString(allStudents.get(i).getMathScore()));
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
}

