import java.util.Comparator;

public class SortFirstName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return (a.getFirstName().compareTo(b.getFirstName()));
    }
}