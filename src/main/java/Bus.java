import javax.print.attribute.standard.Destination;
import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination) {
        this.destination = destination;
        this.capacity = 5;
        this.passengers = new ArrayList<>();
    }


    public int passengerCount() {
        return passengers.size();
    }

    public void pickUpFromQueue(BusStop busStop) {
        busStop.removeFromQueue();
        if( passengerCount() < this.capacity){
            passengers.add(new Person());

        }
    }

    public void removePassenger() {
        if( passengerCount() > 0){
            passengers.remove(0);
        }
    }
}
