import java.util.Comparator;

public class SortScience implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getScienceScore() > b.getScienceScore()) {
            return -1;
        } else if (a.getScienceScore() < b.getScienceScore()) {
            return 1;
        }
        return 0;

    }

}
