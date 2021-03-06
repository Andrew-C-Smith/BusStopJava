import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList <Person> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }


    public int queueCount() {
        return this.queue.size();
    }

    public void addToQueue(Person passenger) {
        this.queue.add(passenger);
    }

    public void removeFromQueue() {
        if( queueCount() > 0){
            queue.remove(0);
        }
    }
}
