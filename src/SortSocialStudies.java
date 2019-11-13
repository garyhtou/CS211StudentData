import java.util.Comparator;

public class SortSocialStudies implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getSocialStudiesScore() > b.getSocialStudiesScore()) {
            return -1;
        } else if (a.getSocialStudiesScore() < b.getSocialStudiesScore()) {
            return 1;
        }
        return 0;

    }

}