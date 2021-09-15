package vehicles;

public class GarageTest {
    public static void main(String[] args) {

        Car supra = new Car();
        supra.setName("supra");
        Car gtr = new Car();
        gtr.setName("gtr");
        Car Nissanz = new Car();
        Nissanz.setName("Nissanz");

        Vehicle[] carsInGarage = new Vehicle[3];
        carsInGarage[0] = supra;
        carsInGarage[1] = gtr;
        carsInGarage[2] = Nissanz;

        Garage garage = new Garage();
        garage.vehicles = carsInGarage;
        garage.alarmCascade();
    }
}
