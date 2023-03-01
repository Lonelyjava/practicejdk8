package practicejdk8.com.singleton.desingpattern;

public class SingletonClass {

    private  static  SingletonClass singletonClass = new SingletonClass();
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){

        return singletonClass;
    }
    public void SimpleMethod(){
        System.out.println("hashcode of the singleton object "+singletonClass);
    }
}
