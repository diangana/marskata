package mars;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import static mars.Direction.*;
public class Plateau {
	
	int MAX_HEIGHT = 10;
	int MAX_WIDTH = 10;
	public Plateau() {
    }
	
	 Optional<Coordinate> Camera(Coordinate coordinate, Direction direction) {
        int x = coordinate.x();
        int y = coordinate.y();

        if (direction == NORD) {
            y = (y + 1) % MAX_HEIGHT;
        }
        if (direction == EST) {
            x = (x + 1) % MAX_WIDTH;
        }
        if (direction == SUD) {
            y = (y > 0) ? y - 1 : MAX_HEIGHT-1;
        }
        if (direction == OUEST) { 
            x = (x > 0) ? x - 1 : MAX_WIDTH-1;
        }
	 
        Coordinate newCoordinate = new Coordinate(x, y);

        return Optional.ofNullable(newCoordinate);
	 }	 
}