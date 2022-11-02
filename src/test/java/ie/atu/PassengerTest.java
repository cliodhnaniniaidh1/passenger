package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp(){
        myPassenger = new Passenger();
    }

    @Test
    void successTitleMr(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void successTitleMrs(){
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void successTitleMs(){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void failureTitle(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.setTitle("Miss");});
        assertEquals("Error, Invalid Title! Options: Mr, Mrs, Ms", exMessage.getMessage());
    }

    @Test
    void successName(){
        myPassenger.setName("Cliodhna");
        assertEquals("Cliodhna", myPassenger.getName());
    }

    @Test
    void failureName(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.setName("Al");});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }

    @Test
    void successID(){
        myPassenger.setID("G0038539611");
        assertEquals("G0038539611", myPassenger.getID());
    }

    @Test
    void failureID(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.setID("G0038539");});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }

    @Test
    void successPhone(){
        myPassenger.setPhone("0089826544");
        assertEquals("0089826544", myPassenger.getPhone());
    }

    @Test
    void failurePhone(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.setPhone("087324");});
        assertEquals("This is not a valid phone number", exMessage.getMessage());
    }

    @Test
    void successAge(){
        assertEquals(21, myPassenger.age(21));
    }

    @Test
    void failureAge(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.age(12);});
        assertEquals("This is not a valid age", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}