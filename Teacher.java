package Inheritance_programs;

public class Teacher {
    Teacher()
    {
        String name="Rutuja";
        System.out.println("Teacher name is: "+name);
    }
}
class Student extends Teacher{
    Student()
    {
        String name1="Aditya";
        System.out.println("student name is: "+name1);
    }

}
class Identify{
    public static void main(String args[]) {
        Student s=new Student();

    }
}

