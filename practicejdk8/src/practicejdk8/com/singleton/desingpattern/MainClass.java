package practicejdk8.com.singleton.desingpattern;

import practicejdk8.com.abstracdesign.Teacher;

public class MainClass {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        singletonClass.SimpleMethod();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.SimpleMethod();

        Teacher teacher = new Teacher();
        System.out.println(teacher);
        Teacher teacher1 = new Teacher();
        System.out.println(teacher1);






    }

}
