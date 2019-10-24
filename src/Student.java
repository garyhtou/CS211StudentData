import java.util.ArrayList;

public class Student {
    public ArrayList<Student> allStudents = new ArrayList<Student>();

    private String firstName;
    private String lastName;
    private int SID;
    private int[] classScores;
    private float totalScorePercentage;
    private char totalScoreLetterGrade;

    public Student(String firstName, String lastName, int SID, int mathScore, int scienceScore, int socialStudiesScore, int languageArtsScore, int computerScienceScore, float totalScorePercentage, char totalScoreLetterGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SID = SID;

        this.classScores = new int[5];
        this.classScores[0] = mathScore;
        this.classScores[1] = scienceScore;
        this.classScores[2] = socialStudiesScore;
        this.classScores[3] = languageArtsScore;
        this.classScores[4] = computerScienceScore;

        this.totalScorePercentage = totalScorePercentage;
        this.totalScoreLetterGrade = totalScoreLetterGrade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getSID(){
        return this.SID;
    }

    public int getMathScore(){
        return this.classScores[0];
    }

    public int getScienceScore(){
        return this.classScores[1];
    }

    public int getSocialStudiesScore(){
        return this.classScores[2];
    }

    public int getLanguageArtsScore(){
        return this.classScores[3];
    }

    public int getComputerScienceScore(){
        return this.classScores[4];
    }

    public float getTotalScorePercentage(){
        return this.totalScorePercentage;
    }

    public char getTotalScoreLetterGrade() {
        return totalScoreLetterGrade;
    }
}
