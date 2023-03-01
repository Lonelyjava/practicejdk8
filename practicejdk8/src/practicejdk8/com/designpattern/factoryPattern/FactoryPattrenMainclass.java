package practicejdk8.com.designpattern.factoryPattern;

public class FactoryPattrenMainclass {

    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession doc =professionFactory.getProfession("Teacher");
        doc.print();
    }
}
