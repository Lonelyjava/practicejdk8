package practicejdk8.com.prototype.designpattern;

public class ProtoTypePatternMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession enggProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(enggProfession);

        Profession techProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(techProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);
    }
}
