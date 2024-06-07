package Lab8;
import java.util.*;

//Omnia Osama Ahmed - 1084505
public class GPAComparator implements Comparator<StudentInfo>
{
    @Override
    public int compare(StudentInfo s1, StudentInfo s2) {
        // Compare student GPAs (priority to lower GPAs)
        if (s1.getGPA() < s2.getGPA()) return -1;
		else if (s1.getGPA() > s2.getGPA()) return 1;
		else return 0;
    }
}


