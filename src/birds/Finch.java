package birds;

public class Finch extends Bird{
    @Override
    public void makeNoise() {
       //call the superclass makeNoise method
        super.makeNoise();
        // then add extra custom code after running the super class code
        System.out.println("chirp chirp");
    }
}
