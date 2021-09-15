package birds;

public class BirdTest {
    public static void main(String[] args) {
      Bird cardinal = new Bird();
      cardinal.setName("cardinal");
        System.out.println(cardinal.getName() +" says ");
        cardinal.makeNoise();
        cardinal.move();

        Duck mallard = new Duck();
        mallard.setName("Mallard");
        System.out.println(mallard.getName() + " says: ");
        mallard.makeNoise();
        mallard.move();

        Finch goldfinch = new Finch();
        goldfinch.setName("goldfinch");
        System.out.println(goldfinch.getName() + " says: ");
        goldfinch.makeNoise();
        goldfinch.move();

        Bird myBird = new Duck();
        myBird.move();
        myBird.makeNoise();

    }
}
