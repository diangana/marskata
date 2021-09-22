package RoverTest;
import mars.Coordinate;
import mars.Plateau;
import mars.Rover;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

public class Rovertest {

    private Rover rover;
    final String SEPARATEUR = " ";
    @Before
    public void initialise() {
        Plateau plateau = new Plateau();
        rover = new Rover(plateau);
        Coordinate coordinate = new Coordinate(0, 0);
    }
   @Test
   @DisplayName("change coordinate.")
   @ParameterizedTest(name = "right")
   @ValueSource(strings = { "5 5" })
   void change_coo(String commands, String position) {
	   String mots[] = commands.split(SEPARATEUR);
	   
       for (int i = 0; i < mots.length; i++) {
           System.out.println(mots[i]);
       }
   	assertNotEquals(rover.move(Integer.parseInt(mots[0]),Integer.parseInt(mots[1])), position);
   }
    @Test
    @DisplayName("display right.")
    @ParameterizedTest(name = "right")
    @ValueSource(strings = { "MMRMMRMRRM" })
    void rotate_right(String commands, String position) {
    	assertNotEquals(rover.execute(commands), position);
    }

    @Test
    @DisplayName("display left.")
    @ParameterizedTest(name = "left")
    @ValueSource(strings = { "LMLMLMLMM" })
    void rotate_left(String commands, String position) {
        assertNotEquals(rover.execute(commands), position);
    }


}