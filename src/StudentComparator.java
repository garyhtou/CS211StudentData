public class StudentComparator {


    ArrayList<Student> students;


    public StudentComparator(ArrayList<Student> students)
    {

        this.students = students;

    }


    public static void fNameSort()
    {

        StillSwap = true;

         while(StillSwap)

             swapCount = 0;
            for(int i = 0; i < students.length()-1; i++)
            {
                if(students[i].getFName().comapereTo(students[i+1].getFName())<0)
                {
                    student1 = students[i];
                    student2 = students[i+1];
                    students[i] = student2;
                    students[2] = student1;
                    swapCount++;
                }
            }
            if(swapCount = 0)
            {
                StillSwap = false;
            }

    }



}
