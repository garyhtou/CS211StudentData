import java.util.ArrayList;
import java.util.Collections;


public class Student {
    public static ArrayList<Student> allStudents = new ArrayList<Student>(); //collection of all students created
    public static String sortedBy; //current sort applied to allStudents

    private String firstName;
    private String lastName;
    private int SID;
    private int[] classScores;
    private int totalScorePercentage;
    private char totalScoreLetterGrade;

    /**
     * Create a new student
     *
     * @param firstName             Student's first name
     * @param lastName              Student's last name
     * @param SID                   Student's SID
     * @param mathScore             Student's math score
     * @param scienceScore          Student's science score
     * @param socialStudiesScore    Student's social studies score
     * @param languageArtsScore     Student's language arts score
     * @param computerScienceScore  Student's computer science score
     * @param totalScorePercentage  Student's total overall score percentage
     * @param totalScoreLetterGrade Student's total overall letter grade
     */
    public Student(String firstName, String lastName, int SID, int mathScore, int scienceScore, int socialStudiesScore, int languageArtsScore, int computerScienceScore, int totalScorePercentage, char totalScoreLetterGrade) {
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

        allStudents.add(this);
    }

    /**
     * get all students
     *
     * @return all students
     */
    public ArrayList<Student> getStudents() {
        return allStudents;
    }

    //getter methods for all of the student data points

    /**
     * Get first name
     *
     * @return first name of student
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name
     *
     * @return last last of student
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Get SID
     *
     * @return SID of student
     */
    public int getSID() {
        return this.SID;
    }

    /**
     * Get math score
     *
     * @return math score of student
     */
    public int getMathScore() {
        return this.classScores[0];
    }

    /**
     * Get science score
     *
     * @return science score of student
     */
    public int getScienceScore() {
        return this.classScores[1];
    }

    /**
     * Get social studies score
     *
     * @return social studies score of student
     */
    public int getSocialStudiesScore() {
        return this.classScores[2];
    }

    /**
     * Get language arts score
     *
     * @return language arts score of student
     */
    public int getLanguageArtsScore() {
        return this.classScores[3];
    }

    /**
     * Get computer science score
     *
     * @return computer science score of student
     */
    public int getComputerScienceScore() {
        return this.classScores[4];
    }

    /**
     * Get total overall score percentage
     *
     * @return total overall score percentage of student
     */
    public int getTotalScorePercentage() {
        return this.totalScorePercentage;
    }

    /**
     * Get total overall score letter grade
     *
     * @return total overall score letter grade of student
     */
    public char getTotalScoreLetterGrade() {
        return totalScoreLetterGrade;
    }


    //hidden sorting calls to make it easier for client code

    /**
     * sort all students by first name
     */
    public static void sortFirstName() {
        Collections.sort(allStudents, new SortFirstName());
        sortedBy = "Sorted by first name:";
    }

    /**
     * sort all students by last name
     */
    public static void sortLastName() {
        Collections.sort(allStudents, new SortLastName());
        sortedBy = "Sorted by last name:";
    }

    /**
     * sort all students by SID
     */
    public static void sortSID() {
        Collections.sort(allStudents, new SortSID());
        sortedBy = "Sorted by SID:";
    }

    /**
     * sort all students by math score
     */
    public static void sortMath() {
        Collections.sort(allStudents, new SortMath());
        sortedBy = "Sorted by math score:";
    }

    /**
     * sort all students by science score
     */
    public static void sortScience() {
        Collections.sort(allStudents, new SortScience());
        sortedBy = "Sorted by science score:";
    }

    /**
     * sort all students by social studies score
     */
    public static void sortSocialStudies() {
        Collections.sort(allStudents, new SortSocialStudies());
        sortedBy = "Sorted by social studies score:";
    }

    /**
     * sort all students by language arts score
     */
    public static void sortLanguageArts() {
        Collections.sort(allStudents, new SortLanguageArts());
        sortedBy = "Sorted by language arts score:";
    }

    /**
     * sort all students by computer science score
     */
    public static void sortComputerScience() {
        Collections.sort(allStudents, new SortComputerScience());
        sortedBy = "Sorted by computer science score:";
    }

    /**
     * sort all students by total overall score percentage
     */
    public static void sortTotalScorePercentage() {
        Collections.sort(allStudents, new SortTotalScorePercentage());
        sortedBy = "Sorted by total grade percentage:";
    }

    /**
     * sort all students by total overall score letter grade
     */
    public static void sortTotalScoreLetterGrade() {
        Collections.sort(allStudents, new SortTotalScoreLetterGrade());
        sortedBy = "Sorted by total letter grade:";
    }

    /**
     * Override default toString method.
     *
     * @return Student's information
     */
    public String toString() {
        String student = this.lastName + ", " + this.firstName + ", " + this.SID + ", ";
        for (int s : classScores) {
            student += (s + ", ");
        }
        student += (this.totalScorePercentage + "%, " + this.totalScoreLetterGrade);
        return student;
    }
}
