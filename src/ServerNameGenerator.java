import java.util.Random;

public class ServerNameGenerator {


    private static String[] individual ={


                "Anthony",
                "Shelby",
                "Kristen",
                "George",
                "Javier",
                "Justin",
                "Matt",
                "Joel",
                "Albert",
                "Amanda"

    };



    public static String[] descritpor ={


                "Funny",
                "Smart",
                "Fast",
                "Cheerful",
                "Powerful",
                "Wise",
                "Chatty",
                "Bold",
                "Friendly",
                "Mean"
    };

  public static String getRandom(String[] array){
      int randomIndex = new Random().nextInt(array.length);
      return array[randomIndex];
        }
    public static void main(String[] args) {
        String indiDesc = getRandom(individual) +"-" + getRandom(descritpor);
        System.out.println("Here is your server name:");
        System.out.println(indiDesc);
    }


}