import java.util.Comparator;

public class SortMath implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getMathScore() > b.getMathScore()) {
            return -1;
        } else if (a.getMathScore() < b.getMathScore()) {
            return 1;
        }
        return 0;

    }

}
