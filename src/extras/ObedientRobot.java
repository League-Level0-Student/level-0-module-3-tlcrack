package extras;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot t = new Robot("mini");
	t.setSpeed(10);
	t.penDown();
	
	String t2 = JOptionPane.showInputDialog("What shape do you want?");
String t3 = JOptionPane.showInputDialog("And what color?");
if(t3.equalsIgnoreCase("blue")) {
    colorBlue(t);}

else if(t3.equalsIgnoreCase("green")) {
    colorGreen(t);}

else if(t3.equalsIgnoreCase("purple")) {
    colorPurple(t);}

else if(t3.equalsIgnoreCase("yellow")) {
    colorYellow(t);}

else if(t3.equalsIgnoreCase("red")) {
    colorRed(t);}

else if(t3.equalsIgnoreCase("orange")) {
    colorOrange(t);}

else {
	JOptionPane.showMessageDialog(null, "I dont know that color. Cancelling color change.");
}
if(t2.equalsIgnoreCase("square")) {
    drawSquare(t);}
	else if(t2.equalsIgnoreCase("triangle")) {
	drawTriangle(t);}
	else if(t2.equalsIgnoreCase("circle")) {
	drawCircle(t);}
	else {
		JOptionPane.showMessageDialog(null, "I don't know that shape. Cancelling shape.");
	}
	
	
	
	
	
	
	
	}
static void drawTriangle(Robot t) {
for(int i=3;i>0;i--) {
	t.move(100);
	t.turn(120);}}

static void drawCircle(Robot t) {
	for(int i=200;i>0;i--) {
		t.move(2);
		t.turn(2);
	}
}

static void drawSquare(Robot t){
	for(int i=4;i>0;i--) {
	t.move(100);
	t.turn(90);}}
static void colorBlue(Robot t){
	t.setPenColor(Color.blue);}

static void colorGreen(Robot t){
	t.setPenColor(Color.green);}

static void colorPurple(Robot t){
	t.setPenColor(Color.magenta);}

static void colorYellow(Robot t){
	t.setPenColor(Color.yellow);}

static void colorRed(Robot t){
	t.setPenColor(Color.red);}

static void colorOrange(Robot t){
	t.setPenColor(Color.orange);}
}


