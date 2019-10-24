import java.io.*;

public class ImportStudents {

    public static void add(File file){

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String row;
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");

                String firstName = data[1];
                String lastName = data[0];
                int SID = Integer.parseInt(data[2]);

                int mathScore = Integer.parseInt(data[3]);
                int scienceScore = Integer.parseInt(data[4]);
                int socialStudiesScore = Integer.parseInt(data[5]);
                int languageArtsScore = Integer.parseInt(data[6]);
                int computerScienceScore = Integer.parseInt(data[7]);

                float totalScorePercentage = Float.parseFloat(data[8]);
                char totalScoreLetterGrade = data[8].toCharArray()[0];

                new Student(firstName, lastName, SID, mathScore, scienceScore, socialStudiesScore, languageArtsScore, computerScienceScore, totalScorePercentage, totalScoreLetterGrade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
