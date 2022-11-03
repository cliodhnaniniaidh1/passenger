package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @BeforeEach
    void setUp(){
    }

    //Testing the success and failure for each title (Mr,Mrs,Ms)
    @Test
    void successTitleMr(){
        Passenger myPassenger = new Passenger("Mr","Bono","G0038639511","0873883598", 21 );
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void successTitleMrs(){
        Passenger myPassenger = new Passenger("Mrs","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void successTitleMs(){
        Passenger myPassenger = new Passenger("Ms","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void failureTitle(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Miss","Cliodhna","G0038639511","0873883598", 21);});
        assertEquals("Error, Invalid Title! Options: Mr, Mrs, Ms", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}