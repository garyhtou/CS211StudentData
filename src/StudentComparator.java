
import java.util.ArrayList;
import java.util.Comparator;

public class StudentComparator {


    private ArrayList<Student> students;
    
    private String sortStatus = "Not Sorted:";
    

    public StudentComparator(ArrayList<Student> students)
    {
        this.students = students;
    }
    
    //method to format the sorted output by the current sort status of the ArrayList of students
    public String getSortStatus() {
    	return sortStatus;
    }

    public ArrayList<Student> getArray()
    {
    	return students;
    }
    
    //used for testing the comparators
    public void printArray() {
        for(Student s: students)
        {
        	System.out.println(s);
        }
    }

    
    
    public void fNameSort()
    {
    	students.sort(Comparator.comparing(Student::getFirstName));
    	sortStatus = "Sorted by first name:";
    }

    public void lNameSort()
    {
    	students.sort(Comparator.comparing(Student::getLastName));
    	sortStatus = "Sorted by last name:";
    }

    public void sidSort()
    {
    	students.sort(Comparator.comparing(Student::getSID));
    	sortStatus = "Sorted by SID:";
    }

    public void mathSort()
    {
    	students.sort(Comparator.comparing(Student::getMathScore).reversed());
    	sortStatus = "Sorted by math score:";
    }

    public void scienceSort()
    {
    	students.sort(Comparator.comparing(Student::getScienceScore).reversed());
    	sortStatus = "Sorted by science score:";
    }

    public void socialStudiesSort()
    {
    	students.sort(Comparator.comparing(Student::getSocialStudiesScore).reversed());
    	sortStatus = "Sorted by social studies score:";
    }
    public void languageArtsSort()
    {
    	students.sort(Comparator.comparing(Student::getLanguageArtsScore).reversed());
    	sortStatus = "Sorted by language arts score:";
    }

    public void computerScienceSort()
    {
    	students.sort(Comparator.comparing(Student::getComputerScienceScore).reversed());
    	sortStatus = "Sorted by computer science score:";
    }
    public void totalScorePercentageSort()
    {
    	students.sort(Comparator.comparing(Student::getTotalScorePercentage).reversed());
    	sortStatus = "Sorted by total grade percentage:";
    }
    public void totalScoreLetterGradeSort()
    {
    	students.sort(Comparator.comparing(Student::getTotalScoreLetterGrade));
    	sortStatus = "Sorted by total letter grade:";
    }
    
    
}


