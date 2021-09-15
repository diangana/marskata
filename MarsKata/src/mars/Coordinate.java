package mars;
import static org.apache.commons.lang3.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang3.builder.HashCodeBuilder.reflectionHashCode;

public class Coordinate {
	static int x;
	static int y;
	 public Coordinate(int dx,int dy){
		 this.x=dx;
		 this.y=dy;
}
	 int x() {
	        return x;
	    }
	 int y() {
	        return y;
	    }
	 @Override
	    public boolean equals(Object other) {
	        return reflectionEquals(this, other);
	    }

	    @Override
	    public int hashCode() {
	        return reflectionHashCode(this);
	    }
	 
}