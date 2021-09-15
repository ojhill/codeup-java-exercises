package birds;

public class BirdShelter {
   public void visitShelterAndHear(Bird[] allTheInTheShelter) {
       for (Bird bird : allTheInTheShelter) {
           System.out.println(bird.getName() + " goes");
           bird.makeNoise();
       }
   }
       public void takeCareOfTheBirdie(Bird birdPatient){
           birdPatient.makeNoise();
       }

    }

