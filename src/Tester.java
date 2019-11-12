
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {

    public static void main(String[] args) {

    	File studentdata = new File("E:\\Programming\\IntelliJ Projects\\CS211 Student Data\\src\\studentData.txt");
    	File outputFile = new File("E:\\Programming\\IntelliJ Projects\\CS211 Student Data\\src\\SortedOutput.txt");
    	FileWriter writer;
		try {
			writer = new FileWriter(outputFile);
			writer.write("");
	    	writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	ImportStudents.add(studentdata);

        StudentComparator sorter = new StudentComparator(Student.allStudents);
        
        sorter.fNameSort();

        sorter.printArray();

        
        sorter.fNameSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.lNameSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.sidSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.mathSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.scienceSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.socialStudiesSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.languageArtsSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.computerScienceSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.totalScorePercentageSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        sorter.totalScoreLetterGradeSort();
        ExportData.saveToFile(outputFile, sorter.getArray(), sorter.getSortStatus());
        

        
    }



}

