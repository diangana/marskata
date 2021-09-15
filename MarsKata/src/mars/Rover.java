package mars;

import java.util.Optional;

public class Rover {
	 private Plateau plateau;
	    Coordinate coordinate = new Coordinate(0, 0);
	    Direction direction = Direction.NORD;
	    public Rover(Plateau plateau) {
	    	this.plateau=plateau;
	    	}
	    public String execute(String commands) {
	        String obstacleString = "";
	        for (char c : commands.toCharArray()) {
	            if (c == 'R') {
	                direction = direction.right();
	            }
	            if (c == 'L') {
	                direction = direction.left();
	            }
	            if (c == 'M') {
	                obstacleString = move();
	            }
	        }
	        return obstacleString + coordinate.x() + ":" + coordinate.y() + ":" + direction.value();
	    }
	    private String move() {
	        Optional<Coordinate> nextCoordinate = plateau.Camera(this.coordinate, direction);
	        nextCoordinate.ifPresent(nc -> this.coordinate = nc);
	        return nextCoordinate.isPresent() ? "" : "O:";
	    }
}

