package practicejdk8.com.designpattern.factoryPattern;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("this is engineer!");
    }
}
