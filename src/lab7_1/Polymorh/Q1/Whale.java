package lab7_1.Polymorh.Q1;

public class Whale extends Cow {


    public void printName() {
        System.out.print("Это неправда: ");
        super.printName();

        System.out.println("Я – кит");
    }

    public void getName() {
        System.out.println("Я не корова, Я - кiт");
    }
}
