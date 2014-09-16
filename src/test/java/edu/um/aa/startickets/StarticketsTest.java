package edu.um.aa.startickets;

/**
 * Created by fscuoteguazza on 15/09/14.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StarticketsTest {

    private StarticketsStub stub = new StarticketsStub();

    @Test
    public void testEventManager() {
        Event movie = stub.decorator.getEventByName("Back to the future");
        assertEquals(movie.name, "Back to the future");
        assertEquals(movie.type, "Movie");
        Event talk = stub.decorator.getEventByName("Fashion tendencies");
        assertEquals(talk.type, "Talk");
        Event circus = stub.decorator.getEventByName("Solei");
        assertEquals(circus.type, "Circus");
        //this is the only one that should be on the database, so it must be a musical
        Event musical = stub.decorator.getEventByName("Les miserables");
        assertEquals(musical.type, "musical");
    }

}
