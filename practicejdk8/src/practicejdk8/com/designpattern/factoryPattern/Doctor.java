package practicejdk8.com.designpattern.factoryPattern;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("this is doctors!");
    }
}
