package main.java.com.stackroute.junit;

import java.util.Comparator;
//program to implement Student class to compare the Students
public class StudentSorter implements Comparator<Student>
{
    @Override
    public int compare(Student s1,Student s2) {
        int r1, r2, r3;
        r1 = s1.studentAge - s2.studentAge;
        r2 = s1.studentName.compareTo(s2.studentName);
        r3 = s1.studentId - s2.studentId;
        if (r1 != 0)
            return r1;
        else {
            if (r2 != 0)
                return r2;
            else
                return r3;
        }
    }
        }
