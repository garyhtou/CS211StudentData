import java.util.Comparator;

public class SortTotalScorePercentage implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getTotalScorePercentage() > b.getTotalScorePercentage()) {
            return -1;
        } else if (a.getTotalScorePercentage() < b.getTotalScorePercentage()) {
            return 1;
        }
        return 0;

    }

}
