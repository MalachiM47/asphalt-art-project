import org.code.neighborhood.*;

//make toadpainter class

public class ToadPainter extends PainterPlus{

  //paints toads
  public void paintToad(){

    paintShoes();
    paintBody();
    paintFace();
    paintHat();
  }

  //paints both toads shoes.
  public void paintShoes(){

    // moves to starting position for painting shoe 1
    moveExact(7, 31);
    

    //paints shoe number 1
    turnRight();
    paintLine("Brown", 5);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("Brown", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("Brown", 3);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("Brown", 2);

    

    //moves to position to paint shoe 2
    moveExact(10, 31);

    //paints shoe 2
    turnLeft();
    paintLine("Brown", 5);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("Brown", 4);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("Brown", 3);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("Brown", 2);

    //paints shoes for toad 2
    
    // moves to starting position for painting shoe 1
    moveExact(23, 31);
    

    //paints shoe number 1
    turnRight();
    paintLine("Brown", 5);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("Brown", 4);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("Brown", 3);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("Brown", 2);

    

    //moves to position to paint shoe 2
    moveExact(26, 31);

    //paints shoe 2
    turnLeft();
    paintLine("Brown", 5);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("Brown", 4);
    turnRight();
    move();
    turnRight();
    move();
    paintLine("Brown", 3);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("Brown", 2);


    

    
  }

  //paints body of toads
  public void paintBody(){

    // gets in starting position
    moveExact(7, 27);

    //paints outline of body 1
    turnRight();
    paintLine("White", 3);
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnRight();
    move();
    paint("White");
    turnLeft();
    move();
    turnRight();
    paintLine("White", 6);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 4);

    //reflect one half of body
    moveExact(10, 27);

    turnLeft();
    paintLine("White", 3);
    turnRight();
    turnRight();
    move();
    turnRight();
    turnRight();
    turnLeft();
    move();
    paint("White");
    turnRight();
    move();
    turnLeft();
    paintLine("White", 6);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("White", 4);

    //bridges two half of stomach
    moveExact(7, 27);
    turnLeft();
    move();
    paintLine("White", 2);

    //paints the second toads body
    // gets in starting position
       // gets in starting position
    moveExact(23, 27);

    //paints outline of body 1
    turnRight();
    paintLine("White", 3);
    turnLeft();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
    turnRight();
    move();
    paint("White");
    turnLeft();
    move();
    turnRight();
    paintLine("White", 6);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 4);

    //reflect one half of body
    moveExact(26, 27);

    turnLeft();
    paintLine("White", 3);
    turnRight();
    turnRight();
    move();
    turnRight();
    turnRight();
    turnLeft();
    move();
    paint("White");
    turnRight();
    move();
    turnLeft();
    paintLine("White", 6);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine("White", 4);

    //bridges two half of stomach
    moveExact(23, 27);
    turnLeft();
    move();
    paintLine("White", 2);

    //fills in the body
    moveExact(6, 26);
    turnLeft();
    paintLine("White", 6);
    turnLeft();
    move();;
    turnLeft();
    paintLine("White", 8);
    turnRight();
    move();
    turnRight();
    paintLine("White", 9);
    turnLeft();
    move();;
    turnLeft();
    paintLine("White", 9);
    turnRight();
    move();
    turnRight();
    paintLine("White", 9);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("White", 9);

    //fills in second toads body
    moveExact(22, 26);
    turnLeft();
    paintLine("White", 6);
    turnLeft();
    move();;
    turnLeft();
    paintLine("White", 8);
    turnRight();
    move();
    turnRight();
    paintLine("White", 9);
    turnLeft();
    move();;
    turnLeft();
    paintLine("White", 9);
    turnRight();
    move();
    turnRight();
    paintLine("White", 9);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine("White", 9);

    //paint left side arms
    moveExact(2, 23);
    turnRight();
    paintLine("Wheat", 2);
    turnLeft();
    paintLine("Wheat", 3);
    moveExact(18, 23);
    turnRight();
    paintLine("Wheat", 2);
    turnLeft();
    paintLine("Wheat", 3);

    //paints right side arms
    moveExact(15, 23);
    turnLeft();
    paintLine("Wheat", 2);
    turnRight();
    paintLine("Wheat", 3);
    moveExact(31, 23);
    turnLeft();
    paintLine("Wheat", 2);
    turnRight();
    paintLine("Wheat", 3);
  }
//paints face of toad
  public void paintFace(){
   //paints first toads left side outline
    moveExact(5, 18);
    paintLine("Wheat", 5);
    turnLeft();
    move();
    paint("Wheat");
    turnRight();
    move();
    turnLeft();
    move();
    paintLine("Wheat", 2);

    //corresponding ears
    moveExact(5, 18);
    turnRight();
    move();
    turnLeft();
    paintLine("Wheat", 2);

    //paints the right side outline of the first toad.
    moveExact(12, 18);
    paintLine("Wheat", 5);
    turnRight();
    move();
    paint("Wheat");
    turnLeft();
    move();
    turnRight();
    move();
    paintLine("Wheat", 2);

    //paints corresponding ears
    moveExact(12, 18);
    turnLeft();
    move();
    turnRight();
    paintLine("Wheat", 2);

    //paints the second toads outline of face
    moveExact(21, 18);
    paintLine("Wheat", 5);
    turnLeft();
    move();
    paint("Wheat");
    turnRight();
    move();
    turnLeft();
    move();
    paintLine("Wheat", 2);

    //paints corresponding ears
    moveExact(21, 18);
    turnRight();
    move();
    turnLeft();
    paintLine("Wheat", 2);


    moveExact(28, 18);
    paintLine("Wheat", 5);
    turnRight();
    move();
    paint("Wheat");
    turnLeft();
    move();
    turnRight();
    move();
    paintLine("Wheat", 2);

    // paints corresponding ears
    moveExact(28, 18);
    turnLeft();
    move();
    turnRight();
    paintLine("Wheat", 2);

    //fills in face
    moveExact(5,18);
    turnLeft();
    for(int i=0; i < 5; i++){
      move();
      paintLine("Wheat", 6);
      if(facingEast()){
        turnRight();
        move();
        turnRight();}
      else{
        turnLeft();
        move();
        turnLeft();
      }
    }
      move();
      paintLine("Wheat", 5);

      moveExact(21,18);
    turnLeft();
    for(int q=0; q < 5; q++){
      move();
      paintLine("Wheat", 6);
      if(facingEast()){
        turnRight();
        move();
        turnRight();}
      else{
        turnLeft();
        move();
        turnLeft();
      }
    }
      move();
      paintLine("Wheat", 5);

    //paints features
    moveExact(7, 19);
    paint("Black");
    turnLeft();
    move();
    move();
    move();
    paint("Black");
    turnRight();
    move();
    move();
    paint("Black");
    move();
    turnRight();
    move();
    paintLine("Black", 2);
    turnRight();
    move();
    paint("Black");

    //paints second toads features
    moveExact(23, 19);
    paint("Black");
    turnLeft();
    move();
    move();
    move();
    paint("Black");
    turnRight();
    move();
    move();
    paint("Black");
    move();
    turnRight();
    move();
    paintLine("Black", 2);
    turnRight();
    move();
    paint("Black");

      
      }
  //makes hats of toads
  public void paintHat(){

  //paints bottom of hat
  moveExact(14,17);
  turnRight();
  paintLine("White", 12);

  //outlines left side of hat
  turnRight();
  move();
  turnRight();
  paintLine("White", 2);
  turnLeft();
  turnLeft();
  move();
  move();
  turnRight();
  paintLine("White", 3);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  turnRight();
  paintLine("White", 4);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("White", 2);

  //outlines right side
  moveExact(15, 17);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
  paintLine("White", 2);
  turnRight();
  turnRight();
  move();
  move();
  turnLeft();
  paintLine("White", 3);
  turnRight();
  turnRight();
  move();
  turnRight();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  turnLeft();
  paintLine("White", 4);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("White", 2);

  //fills in hat
    moveExact(14,16);
    turnRight();
    
    for(int i=0; i < 3; i++){
      move();
      paintLine("White", 12);
      if(facingEast()){
        paint("White");
        turnLeft();
        move();
        turnLeft();}
      else{
        turnRight();
        move();
        turnRight();
      }
    }
    move();
    move();
    move();
    move();
    paintLine("White", 8);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 6);

    //paints second toads hat
    //paints bottom of hat
  moveExact(30,17);
  turnRight();
  paintLine("White", 12);

  //outlines left side of hat
  turnRight();
  move();
  turnRight();
  paintLine("White", 2);
  turnLeft();
  turnLeft();
  move();
  move();
  turnRight();
  paintLine("White", 3);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  turnRight();
  paintLine("White", 4);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine("White", 2);

  //outlines right side
  moveExact(31, 17);
  turnLeft();
  turnLeft();
  move();
  turnLeft();
  paintLine("White", 2);
  turnRight();
  turnRight();
  move();
  move();
  turnLeft();
  paintLine("White", 3);
  turnRight();
  turnRight();
  move();
  turnRight();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  paint("White");
  turnLeft();
  move();
  paint("White");
  turnRight();
  move();
  turnLeft();
  paintLine("White", 4);
  turnRight();
  move();
  turnRight();
  move();
  paintLine("White", 2);

  //fills in hat
    moveExact(30,16);
    turnRight();
    
    for(int i=0; i < 3; i++){
      move();
      paintLine("White", 12);
      if(facingEast()){
        paint("White");
        turnLeft();
        move();
        turnLeft();}
      else{
        turnRight();
        move();
        turnRight();
      }
    }
    move();
    move();
    move();
    move();
    paintLine("White", 8);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("White", 6);

    //paints toad dots
    moveExact(5, 13);
    turnLeft();
    paintSquare("Red");
    moveExact(10,13);
    turnLeft();
    paintSquare("Red");

    //paints second toad dots
    moveExact(21, 13);
    turnLeft();
    paintSquare("Blue");
    moveExact(26,13);
    turnLeft();
    paintSquare("Blue");
    
    
  }
    }

    
    
  

