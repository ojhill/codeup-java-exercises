package vehicles;

public class GarageTest {
    public static void main(String[] args) {

        Car supra = new Car();
        supra.setName("supra");
        Car gtr = new Car();
        gtr.setName("gtr");
        Suv forrunner = new Suv();
        forrunner.setName("4runner");

        Vehicle[] carsInGarage = new Vehicle[3];
        carsInGarage[0] = supra;
        carsInGarage[1] = gtr;
        carsInGarage[2] = forrunner;

        Garage garage = new Garage();
        garage.vehicles = carsInGarage;
        garage.alarmCascade();
    }
}
