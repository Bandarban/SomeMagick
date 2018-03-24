package lab7_2.Interface;

public class Pickup implements CargoAuto, PassangersAuto {
    @Override
    public void transportStuff() {
        System.out.println("Пикап везет вещи");
    }

    @Override
    public void transportPeople() {
        System.out.println("Пикап везет человеков");
    }
}
