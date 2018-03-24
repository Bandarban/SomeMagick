package lab6.Q3;

public class Fish {
    private int age;
    private float weight;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void swim() {
        System.out.println("БУЛЬ БУЛЬ");
    }
}
