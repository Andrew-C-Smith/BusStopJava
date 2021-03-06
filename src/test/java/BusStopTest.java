import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person passenger;


    @Before
    public void before(){
        busStop = new BusStop("MussStop");
        passenger = new Person();

    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(passenger);
        assertEquals(1,busStop.queueCount());
    }

    @Test
    public void canRemoveFromQueue(){
        busStop.addToQueue(passenger);
        busStop.removeFromQueue();
        assertEquals(0, busStop.queueCount());
    }

}
