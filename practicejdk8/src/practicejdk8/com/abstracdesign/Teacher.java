package practicejdk8.com.abstracdesign;

public class Teacher implements Profession{
    @Override
    public void print() {
        System.out.println("This is Teacher");
    }
}
