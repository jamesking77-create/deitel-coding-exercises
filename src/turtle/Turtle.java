package turtle;

import static turtle.Direction.*;

public class Turtle{
    private Direction direction = EAST;

    private  static  Position position = new Position(0, 0);

    private static boolean penIsUp = true;

    public boolean penIsUp() {
        return penIsUp;
    }

    public boolean penIsDown() {
        return  penIsUp = false;
    }

    public void penUp() {
       penIsUp = true;
    }

    public Object getCurrentDirection() {
        return direction;
    }

    public void turnRight() {
        if (direction == NORTH) face(EAST);
       else if (direction == WEST) face(NORTH);
       else if (direction == SOUTH) face(WEST);
       else if (direction == EAST) face(SOUTH);

    }

    private void face(Direction direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        if (direction == EAST) face(NORTH);
        else if (direction == NORTH) face(WEST);
        else  if (direction == WEST) face(SOUTH);
        else if (direction == SOUTH) face(EAST);
    }

    public Position getPosition() {
        return position;
    }

    public void moveForward(int steps) {
        position.setColumn(position.getColumn() + steps);
    }
}
