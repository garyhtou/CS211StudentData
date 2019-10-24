import java.io.*;

public class ImportStudents {

    public static void add(File file){

        try (BufferedReader csvReader = new BufferedReader(new FileReader(file))) {
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");

                String firstName = data[1];
                String lastName = data[0];
                int SID = Integer.parseInt(data[2]);

                int[] classScores = new int[5];
                classScores[0] = Integer.parseInt(data[3]);
                classScores[1] = Integer.parseInt(data[4]);
                classScores[2] = Integer.parseInt(data[5]);
                classScores[3] = Integer.parseInt(data[6]);
                classScores[4] = Integer.parseInt(data[7]);

                float totalScorePercentage = Float.parseFloat(data[8]);
                char totalScoreLetterGrade = data[8].toCharArray()[0];

                new Student(firstName, lastName, SID, classScores, totalScorePercentage, totalScoreLetterGrade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream stream = new FileInputStream(file);

            while(stream.available() > 0) {
                String firstName;
                String lastName;
                int SID;
                int[] classScores;
                float totalScorePercentage;
                char totalScoreLetterGrade;

                st

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
