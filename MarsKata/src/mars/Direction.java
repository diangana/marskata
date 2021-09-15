package mars;
enum Direction {
    NORD("N", "W", "E"),
    EST("E", "N", "S"),
    SUD("S", "E", "W"),
    OUEST("W", "S", "N");

    private  String value;
    private  String left;
    private  String right;

    Direction(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Direction right() {
        return directionChoose(right);
    }

    public Direction left() {
        return directionChoose(left);
    }

    public String value() {
        return value;
    }

    private Direction directionChoose(String value) {
        for (Direction direction : values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        return null;
    }
}