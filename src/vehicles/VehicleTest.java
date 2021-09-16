package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle toyota = new Vehicle();
        toyota.setName("toyota");
        System.out.println(toyota.getName() + " goes");
        toyota.makeNoise();

        Truck tundra = new Truck();
        tundra.setName("tundra");
        System.out.println(tundra.getName() + " goes");
        tundra.makeNoise();

        Motorcycle gsxr = new Motorcycle();
        gsxr.setName("gsxr");
        System.out.println(gsxr.getName() + " goes");
        gsxr.makeNoise();

        Car supra = new Car();
        supra.setName("supra");
        System.out.println(supra.getName() + " goes");
        supra.makeNoise();

        Car gtr = new Car();
        gtr.setName("gtr");
        System.out.println(gtr.getName() + " goes");
        gtr.makeNoise();

        Suv forrunner = new Suv();
        forrunner.setName("4runner");
        System.out.println(forrunner.getName() + " goes");
        forrunner.makeNoise();
    }



}
