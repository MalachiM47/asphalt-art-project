import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    SkyPainter myguy = new SkyPainter();
   
   myguy.paintSky();


    //instantiate toadpainter
    ToadPainter tp = new ToadPainter();

    tp.paintToad();
  }
}