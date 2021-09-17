package pets;

public class Cat extends Pet{
@Override
    public void responseToCommand(String command) {
        System.out.println("Meow... coughs up hairball...");
    }
}
