package extras;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot t = new Robot("mini");
	t.setSpeed(10);
	t.penDown();
	
	
drawSquare(t);
	
	drawTriangle(t);
	
	drawCircle(t);

	
	
	}
static void drawTriangle(Robot t) {
for(int i=3;i>0;i--) {
	t.move(100);
	t.turn(120);}}

static void drawCircle(Robot t) {
	for(int i=200;i>0;i--) {
		t.move(1);
		t.turn(2);
	}
}

static void drawSquare(Robot t){
	for(int i=4;i>0;i--) {
	t.move(100);
	t.turn(90);}}
}