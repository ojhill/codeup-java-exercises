package vehicles;

public class Garage {
    Vehicle[] vehicles;
    public void alarmCascade(){
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle.getName()+ " goes beep beep");
        }
    }
}

