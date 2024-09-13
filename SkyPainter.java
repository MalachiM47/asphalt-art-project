 import org.code.neighborhood.*;

public class SkyPainter extends MuralPainter{

  public void paintSky(){
    paintBackground("LightBlue", 32);
    paintClouds();

    //paints grass
    moveExact(0, 32);
    turnLeft();
    paintLine("Green", 32);
  }
  //paints three clouds
  public void paintClouds(){
    moveExact(0, 0);
    turnLeft();

    //paints first cloud

    paintLine("White", 10);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("White", 10);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("White", 8);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("White", 6);

    //paints middle cloud
    moveExact(13, 0);
    turnLeft();
    paintLine("White", 8);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("White", 8);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 6);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("White", 4);

    //paints last cloud
    moveExact(32, 0);
    turnRight();
    paintLine("White", 10);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("White", 10);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("White", 8);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 6);

  }
}