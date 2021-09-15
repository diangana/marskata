package RoverTest;
import  mars.*;
import junit.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized.Parameters;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnit4.class)
public class Rovertest {

    private Rover rover;

    @Before
    public void initialise() {
        Plateau plateau = new Plateau();
        rover = new Rover(plateau);
    }

    @Test
    @Parameters({
    	"5 5 RMRMRMRMM" })
    public void rotate_right(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
        "  5 5 1 2 N LMLMLMLMM"
    })
    public void rotate_left(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
    	   "  5 5 1 2 N MMRRMMMM"
    })
    public void move_up(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
    	"  5 5 1 2 N MMRRMMMM"
    })
    public void wrap_from_top_to_bottom_when_moving_north(String commands, String position) {
        extracted(commands, position);
    }

	private void extracted(String commands, String position) {
		assertThat(rover.execute(commands), is(position));
	}

    @Test
    @Parameters({
        "\"  5 5 1 2 N MMRMMMRM\"
    })
    public void move_right(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
    	"  5 5 1 2 N MMRRMMMM"
    })
    public void wrap_from_right_to_left_when_moving_east(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
    	"  5 5 1 2 N MMLMLMLMM"
    })
    public void
    move_left(String commands, String position) {
        extracted(commands, position);
    }

    @Test
    @Parameters({
            "\"  5 5 1 2 N MMLLMMMM\"
    })
    public void
    move_south(String commands, String position) {
        extracted(commands, position);
    }

}