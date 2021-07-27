import java.util.*;

class StudentInfo //Parent or base class
{
    String name = ""; int rollno;

    public static void main(String[] args)
    {
        Exams e1 = new Exams();
        e1.name = "ABC";
        e1.rollno = 5;
        e1.subject = "English";
        e1.marks = 30.5;

        System.out.println(e1.name + " got " + e1.marks + " marks");

        Attendance a1 = new Attendance();
        a1.name = "PQR";
        a1.rollno = 12;
        a1.attendance = 'P';
        a1.date = new Date();

        System.out.println("Attendance for " + a1.date + " :" + a1.attendance);
    }
}

class Exams extends StudentInfo //Child or derived class
{
    String subject = ""; double marks;
}

class Attendance extends StudentInfo //Child or derived class
{
    char attendance; Date date;
}