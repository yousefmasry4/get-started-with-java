package sheet3.n3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/*
Write the Course class, which defines the variables: courseName, students (array
of Strings) and numberOfStudents. It also had a constructor that initiates objects
using only the courseName; getter methods for the courseName, students and
numberOfStudents; and a function that adds a new student.

     Update this program such that it can automatically increase the array size
        by creating a new larger array and copying the contents of the current
        array to it.
     Implement the dropStudent method.
     Add a new method named clear() that removes all students from the
        course.
 */
class Course {
    final String courseName;
    String[] students;
    final int numberOfStudents;
    int c=0;

    Course(String courseName, int numberOfStudents) {
        this.courseName = courseName;
        this.students=new String[numberOfStudents];
        this.numberOfStudents = numberOfStudents;
    }

    public void add(String student){
        this.students[c]=student;
        c++;
    }

    public void clear(){
        this.students=null;
    }

    public void  delete(@NotNull String name){
        int flag=0;
        for(int i=0;i<this.numberOfStudents;i++){
            if(this.students[i] == name){
                flag=1;
            }
            if(this.students[i] == null){
                return;
            }
            if(flag == 1){
                for(int j=i;j<this.numberOfStudents-1;j++){
                    if(students[j] == null)
                        return;
                    students[j]=students[j+1];
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + Arrays.toString(students).toString() +
                ", numberOfStudents=" + numberOfStudents +
                ", c=" + c +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Course c=new Course("cs50",10);
        c.add("youssef");
        c.add("youssef12");
        c.add("youssef32");
        c.add("youssef34");
        c.add("youssef54");
        c.add("youssef564");
        c.add("youssefsdgv");
        System.out.println(c.toString());
        c.delete("youssef12");
        System.out.println(c.toString());
        c.delete("youfdsfssef12");
        System.out.println(c.toString());
        c.clear();
        System.out.println(c.toString());
    }
}
