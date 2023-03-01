package practicejdk8.com.prototype.designpattern;

public abstract class Profession implements Cloneable {

    public int id;
    public String name;

    abstract void print();

    public Object cloninMethod() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
