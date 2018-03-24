package lab7_1.Polymorh.Q3;

public class Dog extends Cat {
    @Override
    public Dog getChild() {
        return new Dog();
    }
}
