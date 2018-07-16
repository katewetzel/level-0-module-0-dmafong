import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot bob=new Robot();
	bob.setSpeed(20);
	bob.penDown();
	bob.turn(180);
	bob.move(200);
	bob.penUp();
	bob.turn(180);
	bob.move(100);
	bob.turn(40);
	bob.penDown();
	bob.move(120);
	bob.penUp();
	bob.turn(180);
	bob.move(120);
	bob.turn(-80);
	bob.penDown();
	bob.move(120);
}
}

