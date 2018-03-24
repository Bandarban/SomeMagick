package lab6.Q2;

public class Dog extends Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void printInfo() {
        System.out.println("Type - dog, weight - " + getWeight() +
                ", age - " + getAge() +
                ", gender - " + (getGender() ? "Male" : "Female") +
                ", name - " + getName() + ".");
    }
}
