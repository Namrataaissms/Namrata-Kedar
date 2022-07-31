package Inheritance_programs;

public class Parent {
    void angry() {
        System.out.println("parent is angry on his child");
    }
}
class Child extends Parent{
    void scared()
    {
        System.out.println("child is scared because parents are angry");
    }
    public static void main(String args[]) {
        Child c=new Child();
        c.angry();
        c.scared();
    }
}
