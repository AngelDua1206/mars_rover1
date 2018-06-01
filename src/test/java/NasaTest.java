import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NasaTest {

    @Test
    public void shouldReturnTrueGivenCurrentDirectionEastAndActionLeft() {
        char currentDirection = 'E';
        Rover rover = new Rover(currentDirection);
        Rover result = new Rover('N');
        char action = 'L';

        assertEquals(true, result.equals(rover.applyAction(action)));
    }
}