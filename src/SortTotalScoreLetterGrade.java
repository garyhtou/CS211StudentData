import java.util.Comparator;

public class SortTotalScoreLetterGrade implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getTotalScoreLetterGrade() < b.getTotalScoreLetterGrade()) {
            return -1;
        } else if (a.getTotalScoreLetterGrade() > b.getTotalScoreLetterGrade()) {
            return 1;
        }
        return 0;

    }

}