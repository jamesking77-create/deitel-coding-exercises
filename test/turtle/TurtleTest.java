package turtle;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;
//import static tdd.Turtle.Direction.*;

public class TurtleTest {



        Turtle turtle;
        @BeforeEach
        void setUp(){
            turtle = new Turtle();
        }

        @Test
        public void turtleCanMovePenDownTest(){
            assertTrue(turtle.penIsUp());
            turtle.penIsDown();
            assertFalse(turtle.penIsUp());
        }

        @Test
        public void turtleCanMovePenUpTest(){
            turtle.penIsDown();
            assertFalse(turtle.penIsUp());
            turtle.penUp();
            assertTrue(turtle.penIsUp());
        }

        @Test
        public void turtleCanTurnRightWhileFacingEastTest(){
            assertSame(turtle.getCurrentDirection(), EAST);
            turtle.turnRight();
            assertSame(SOUTH, turtle.getCurrentDirection());
        }
        @Test
        public void turtleCanTurnRightWhileFacingSouthTest(){
            turtle.turnRight();
            assertSame(turtle.getCurrentDirection(), SOUTH);
            turtle.turnRight();
            assertSame(WEST, turtle.getCurrentDirection());

        }

        @Test
        public void turtleCanTurnRightWhileFacingWestTest(){
            turtle.turnRight();
            assertSame(turtle.getCurrentDirection(), SOUTH);
            turtle.turnRight();
            assertSame(WEST, turtle.getCurrentDirection());
            turtle.turnRight();
            assertSame(NORTH, turtle.getCurrentDirection());
        }
        @Test
        public void turtleCanTurnRightWhileFacingNorthTest(){
            turtle.turnRight();
            assertSame(turtle.getCurrentDirection(), SOUTH);
            turtle.turnRight();
            assertSame(WEST, turtle.getCurrentDirection());
            turtle.turnRight();
            assertSame(NORTH, turtle.getCurrentDirection());
            turtle.turnRight();
            assertSame(EAST, turtle.getCurrentDirection());
        }

        @Test
        public void turtleCanTurnLeftWhileFacingEastTest(){
            assertSame(turtle.getCurrentDirection(), EAST);
            turtle.turnLeft();
            assertSame(NORTH, turtle.getCurrentDirection());
        }

        @Test
        public void turtleCanTurnLeftWhileFacingNorthTest(){
            turtle.turnLeft();
            assertSame(turtle.getCurrentDirection(), NORTH);
            turtle.turnLeft();
            assertSame(WEST, turtle.getCurrentDirection());
            turtle.turnLeft();
            assertSame(SOUTH, turtle.getCurrentDirection());
            turtle.turnLeft();
            assertSame(EAST, turtle.getCurrentDirection());
        }

        @Test
        public void turtleCanMoveForwardWhileFacingEastTest(){
            assertSame(turtle.getCurrentDirection(), EAST);
            assertEquals(new Position(0,0), turtle.getPosition());
            turtle.moveForward(5);
            assertEquals(new Position(0,5), turtle.getPosition());
        }
    }

