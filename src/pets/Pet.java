package pets;

abstract public class Pet {
    public int age;
    public int weight;
    public String species;
    public String name;

    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }
    abstract public void responseToCommand(String command);
}
