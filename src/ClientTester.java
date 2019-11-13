import java.io.File;

public class ClientTester {

    public static void main(String[] args) {

        //file paths
        File studentdata = new File("E:\\Programming\\IntelliJ Projects\\CS211 Student Data\\src\\studentData.txt");
        File outputFile = new File("E:\\Programming\\IntelliJ Projects\\CS211 Student Data\\src\\SortedOutput.txt");

        //adds all students in the student data file.
        ImportStudents.add(studentdata);

        //Creates or override existing output file
        ExportData.createFile(outputFile);

        //Start sorting and adding to output file.
        Student.sortFirstName();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortLastName();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortSID();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortMath();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortScience();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortSocialStudies();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortLanguageArts();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortComputerScience();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortTotalScorePercentage();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);
        Student.sortTotalScoreLetterGrade();
        ExportData.saveToFile(outputFile, Student.allStudents, Student.sortedBy);

    }
}

