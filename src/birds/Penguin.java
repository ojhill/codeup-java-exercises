package birds;

public class Penguin extends Bird{
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("honk honk");
    }
}
