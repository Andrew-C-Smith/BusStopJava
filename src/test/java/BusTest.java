import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person passenger;
    private BusStop mussStop;

    @Before
    public void before(){
        bus = new Bus("Muss");
        passenger = new Person();
        mussStop = new BusStop("MussStop");
    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0,bus.passengerCount());
    }

    @Test
    public void hasNumberOfPassengers(){
        bus.pickUpFromQueue(mussStop);
        assertEquals(1,bus.passengerCount());
    }

    @Test
    public void hasMaxCapacity(){
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        assertEquals(5, bus.passengerCount());

    }

    @Test
    public void canRemovePassenger(){
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.removePassenger();
        assertEquals(1,bus.passengerCount());

    }

    @Test
    public void canPickUpFromStop(){
        mussStop.addToQueue(passenger);
        mussStop.addToQueue(passenger);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);
        bus.pickUpFromQueue(mussStop);

        assertEquals(2, bus.passengerCount());

    }






}
