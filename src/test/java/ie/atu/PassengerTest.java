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
        assertEquals("Mr", myPassenger.title("Mr"));
    }

    @Test
    void successTitleMrs(){
        assertEquals("Mrs", myPassenger.title("Mrs"));
    }

    @Test
    void successTitleMs(){
        assertEquals("Ms", myPassenger.title("Ms"));
    }

    @Test
    void failureTitle(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { myPassenger.title("Miss");});
        assertEquals("Error, Invalid Title! Options: Mr, Mrs, Ms", exMessage.getMessage());
    }

    @Test
    void successName(){
        assertEquals("Cliodhna", myPassenger.name("Cliodhna"));
    }

    @Test
    void failureName(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.name("Al");});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }

    @Test
    void successID(){
        assertEquals("G0038539611", myPassenger.id("G0038539611"));
    }

    @Test
    void failureID(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.id("G0038539");});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }

    @Test
    void successPhone(){
        assertEquals("0089826544", myPassenger.phone("0089826544"));
    }

    @Test
    void failurePhone(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {myPassenger.phone("087324");});
        assertEquals("This is not a valid phone number", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}