
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
Robot r2 = new Robot();
		//3. ask the user what color they would like the robot to draw
for(int i=0;i<1;i--)		{
String t = JOptionPane.showInputDialog("what color would you like me to draw my shape?");
		//4. use an if/else statement to set the pen color that the user requested
if(t.equals("blue")) {
	r2.setPenColor(0,0,255);
}
if(t.equals("green")) {
	r2.setPenColor(0,255,0);
}
if(t.equals("red")) {
	r2.setPenColor(255,0,0);
}
        //5. if the user doesn’t enter anything, choose a random color
else {
		r2.setRandomPenColor();
}
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		r2.setPenWidth(10);
		r2.penDown();
		r2.setSpeed(10);
	    //1. make the robot draw a shape (this will take more than one line of code)
r2.move(100);
r2.turn(90);
r2.move(100);
r2.turn(90);
r2.move(100);
r2.turn(90);
r2.move(100);
}
	}
}
