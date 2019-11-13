import java.util.Comparator;

public class SortSID implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getSID() < b.getSID()) {
            return -1;
        } else if (a.getSID() > b.getSID()) {
            return 1;
        }
        return 0;

    }

}