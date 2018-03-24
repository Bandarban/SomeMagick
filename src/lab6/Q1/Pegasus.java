package lab6.Q1;

public class Pegasus extends Horse {
    public Pegasus(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " is flying!");
    }

    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus("Konek");
        pegasus.fly();
    }
}
