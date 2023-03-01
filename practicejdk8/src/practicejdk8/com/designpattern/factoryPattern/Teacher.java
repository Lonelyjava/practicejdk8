package practicejdk8.com.designpattern.factoryPattern;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("this is teacher!");
    }
}
