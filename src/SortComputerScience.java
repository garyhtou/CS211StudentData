import java.util.Comparator;

public class SortComputerScience implements Comparator<Student> {


    public int compare(Student a, Student b) {

        if (a.getComputerScienceScore() > b.getComputerScienceScore()) {
            return -1;
        } else if (a.getComputerScienceScore() < b.getComputerScienceScore()) {
            return 1;
        }
        return 0;

    }

}