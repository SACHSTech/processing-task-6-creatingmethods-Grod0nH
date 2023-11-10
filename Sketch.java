import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(173, 216, 230);
  }

  
  public void draw() {

    //draws the row of suns at the top
    drawSun(80, 60, 50);
    drawSun(220, 60, 50);
    drawSun(360, 60, 50);
    drawSun(500, 60, 50);

    //draws the rows of the houses
    for(int i = 50; i<=600; i+=80){
      for (int j = 250; j<=600; j+=100){
      drawHouse(i, j, (int)(0.1*(i)+90), (int)(0.255*(i)), (int)(0.7*(i)));
    }
  }
    //draws the moon based of the returned coordinate of intCoord
   drawMoon(intCoord(300, 300), intCoord(100, 100)-50);
}

/*
 * Draws a sun with rays 
 * @author Gordon H
 * @param circleX the first x value
 * @param circleY the first y value
 * @param circleDiameter the diameter of the circle
 */
public void drawSun(float circleX, float circleY, float circleDiameter) {
  fill(255, 255, 0);
  stroke(255,255,0);
  ellipse(circleX, circleY, circleDiameter, circleDiameter);
  strokeWeight(4);
  //draws the suns rays
  line(circleX+20,circleY+20, circleX+40, circleY+40);
  line(circleX,circleY+20, circleX, circleY+55);
  line(circleX-20,circleY+20, circleX-40, circleY+40);
  line(circleX-20,circleY, circleX-60, circleY);
  line(circleX,circleY, circleX+60, circleY);
  line(circleX,circleY, circleX, circleY-60);
  line(circleX-20,circleY-20, circleX-40, circleY-40);
  line(circleX+20,circleY-20, circleX+40, circleY-40);
  
  }
  /*
   * Draws minature houses
   * @author Gordon H
   * @param floatX is first x value
   * @param floatY is the first y value
   * @param intR is the Red in RGB
   * @param intG is the Green in RGB
   * @param intB is the Blue in RGB
   */
  public void drawHouse(float floatX, float floatY, int intR, int intG, int intB){
    stroke(0);
    //House Base
    fill(intR,intG,intB);
    rect(floatX, floatY, 40,40);
    //House Top
    fill(intR,intG,intB);
    triangle(floatX-10, floatY, floatX+20, floatY-25, floatX+50, floatY); 
    //Door
    fill(intR,intG,intB);
    rect(floatX+16, floatY+20, 10, 20);
  }

  /*
   * gives coordinates for the moon
   * @author Gordon H
   * @param intX is first x value
   * @param intY is the first y value
   * @return will return the coordinate of the moon
   */
  public int intCoord(int intX, int intY){
    intY = (intX/2)+150;
    return (intY);
  }

  //This draws the moon
  public void drawMoon(int intX, int intY){
    fill(211,211,211);
    ellipse(intX,(float)(intY*1.07),80,80);
    stroke(180,180,180);
    fill(150,150,150);
    ellipse(intX, intY, 20,20);
    ellipse(intX+20, intY+10, 20,20);
    ellipse(intX-10, intY+30, 20,20);

  }
}



