import java.util.*;

public class Fan {
final int slow = 1;
final int medium = 2;
final int fast = 3;
private int speed = slow;
private boolean on = false;
private double radius = 5;
public String color = "blue";

public int getSpeed(){
	return speed;
}

public boolean getOn(){
	return on;
}

public double getRadius(){
	return radius;
}

public String getColor(){
	return color;
}

public void setSpeed(int speed){
	this.speed = speed;
}

public void isOn(boolean on){
	this.on = on;
}

public void setRadius(double radius){
	this.radius = radius;
}

public void setColor(String color){
	this.color = color;
}

public Fan(){
Fan fanDefault = new Fan();	
}

public String toString(){
	if (this.on = true){
		return "Fan's color is " + this.color + ", and speed is" + this.speed + ", and radius is" + this.radius;
	}else{
		return "The fan is off and the color is" + this.color + "and radius is " + this.radius;
	}
	
}

}
