package pets;

public class Dog extends Pet{
@Override
    public void responseToCommand(String command) {
        System.out.println("Obeys " + command + " dutifully...");
    }
}
