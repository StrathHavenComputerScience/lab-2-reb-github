public class Lab2
{
    //Pre: Robot is on light square with dirty square
    //Post: Robot is on the same square but the whole square is now clean
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    cleanOneRow();
    cleanOneRow();
    cleanOneRow();
    cleanOneRow();
}
    
//Pre: Robot is on a light square facing a row of dark squares and one light square at the end
//Post: Robot is on a light square, turned to the left, with light squares to its left 
    public static void cleanOneRow()
    {
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.turnLeft();
    }
    //robot is in top left corner facing left
    
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    oneCombRow();
    moveUp();
    oneCombRow();
    moveUp();
    oneCombRow();
    moveUp();
    oneCombRow();
    moveUp();
    oneCombRow();
  }
  
  public static void moveUp()
  {
    Robot.move();
    Robot.makeDark();
    Robot.move();  
    }
  public static void oneCombRow()
  {
    turnRight();
    upRow();
    downRow();
    }
  
  public static void downRow()
  {
   turnAround();
   Robot.move();
   Robot.move();
   Robot.move();
   Robot.move();
   Robot.move();
   Robot.move();
   turnRight();
    }
  
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    }
 
  public static void upRow()
  {
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.makeDark();
    }
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
    }
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    oddStrip();
    evenStrip();
    oddStrip();
    evenStrip();
    oddStrip();
    evenStrip();
    oddStrip();
    lastStrip();
    
  }
  
 public static void oddStrip()
 {
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  turnRight();
  Robot.move();
  turnRight();
    }
    
  public static void evenStrip()
 {
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.turnLeft();
  Robot.move();
  Robot.turnLeft();
    }
    
  public static void lastStrip()
  {
    Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();
  Robot.move();
  Robot.makeDark();
  Robot.move();  
    }
}
