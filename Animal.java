package Inheritance_programs;

public class Animal {
    void eating()
    {
        System.out.println("panda eats.... bamboo");
    }
}
class Panda extends Animal{
    void sleeping() {
        System.out.println("panda loves.... eating and sleeping");
    }
}
class Panda1  extends  Panda{
    void appearance() {
        System.out.println("panda is black and white in colour");
    }
}
class TestPanda{
    public static void main(String args[]) {
        Panda1 p=new Panda1();
        p.eating();
        p.sleeping();
        p.appearance();
    }
}
