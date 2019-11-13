import java.util.Comparator;

public class SortLanguageArts implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getLanguageArtsScore() > b.getLanguageArtsScore()) {
            return -1;
        } else if (a.getLanguageArtsScore() < b.getLanguageArtsScore()) {
            return 1;
        }
        return 0;

    }

}
