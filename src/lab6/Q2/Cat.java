package lab6.Q2;

public class Cat extends Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Type - cat, weight - " + getWeight() +
                ", age - " + getAge() +
                ", gender - " + (getGender() ? "Male" : "Female") +
                ", name - " + getName() + ".");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Vasa");
        cat.setAge(10);
        cat.setGender(true);
        cat.setWeight(10);
        cat.printInfo();
    }
}
