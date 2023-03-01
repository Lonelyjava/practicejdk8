package practicejdk8.com.abstracdesign;

public class FactoryPatternMainClass {
    public static void main(String[] args) {

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(false);
        Profession enngg =abstractFactory.getProfession("Engineer");
        enngg.print();
    }
}
