package lab7_2.Interface;

public class Truck implements CargoAuto {
    @Override
    public void transportStuff() {
        System.out.println("Грузовик везет груз -_-");
    }
}
