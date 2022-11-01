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

    @AfterEach
    void tearDown() {
    }
}