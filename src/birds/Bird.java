package birds;

public class Bird {
    //what kind of bird is it?
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void makeNoise(){
        System.out.println("tweet tweet");
    }
    public void move(){
        System.out.println("flap flap");
    }
//    public Bird(String name){
//        this.name = name;
//    }
}
