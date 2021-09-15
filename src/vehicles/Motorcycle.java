package vehicles;

public class Motorcycle extends Vehicle{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("clank clank");
    }
}
