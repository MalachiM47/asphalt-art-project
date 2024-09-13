import org.code.neighborhood.*;

public class PainterPlus extends Painter{
 
  //turns painter right
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }

  //paints a line as long as wanted

  public void paintLine(String color, int spaces) {
   
    for(int i=0; i < spaces; i++){
      
      paint(color);

      if (canMove()) {
        move();
      }
    }
  }

  
  //paints 3x3 square with out middle
  public void paintDonut(String color){
   while(hasPaint()){
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
} 
  }

  //takes all paint from bucket
  public void takeAllPaint(){
    while(isOnBucket()){
      takePaint();
  }
} 
 
  //moves painter forward until he cant
  public void moveFast(){
    while(canMove()){
      move();
    }
  }


  //paints a line of paint until out of paint
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
        move();
    }
  }
  public void turnWest(){
    if (isFacingNorth()){
      turnLeft();
    }
    if(isFacingSouth()){
      turnRight();
    }
    if(isFacingEast()){
        turnLeft();
        turnLeft();
      }
  }

  public void moveExact(int x, int y){
   
    //returns to starting position
    turnWest();
    moveFast();
    turnRight();
    moveFast();
    turnRight();

    for (int i=0; i< x-1; i++){
      move();
    }

    turnRight();

    for (int i=0; i< y-1; i++){
      move();
    }

      
  }
//paints a 3x3 square
  public void paintSquare(String color){

    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
    turnRight();
    move();
    paint(color);
  }
}

