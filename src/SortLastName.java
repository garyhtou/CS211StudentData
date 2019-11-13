import java.util.Comparator;

public class SortLastName implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return (a.getLastName().compareTo(b.getLastName()));
    }

}
