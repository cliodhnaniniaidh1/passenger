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

    //testing success and failure of name
    @Test
    void successName(){
        Passenger myPassenger = new Passenger("Ms","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals("Cliodhna", myPassenger.getName());
    }

    @Test
    void failureName(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Ms","Al","G0038639511","0873883598", 21);});
        assertEquals("This is not a valid name", exMessage.getMessage());
    }

    //testing success and failure for id
    @Test
    void successID(){
        Passenger myPassenger = new Passenger("Ms","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals("G0038639511", myPassenger.getID());
    }

    @Test
    void failureID(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Ms","Cliodhna","G003863","0873883598", 21);});
        assertEquals("This is not a valid ID", exMessage.getMessage());
    }

    //testing success and failure for phone
    @Test
    void successPhone(){
        Passenger myPassenger = new Passenger("Ms","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals("0873883598", myPassenger.getPhone());
    }

    @Test
    void failurePhone(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Ms","Cliodhna","G0038639511","0873", 21);});
        assertEquals("This is not a valid phone number", exMessage.getMessage());
    }

    //testing success and failure of age
    @Test
    void successAge(){
        Passenger myPassenger = new Passenger("Ms","Cliodhna","G0038639511","0873883598", 21 );
        assertEquals(21, myPassenger.getAge());
    }

    @Test
    void failureAge(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> { new Passenger("Ms","Cliodhna","G0038639511","0873883598", 12);});
        assertEquals("This is not a valid age", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}