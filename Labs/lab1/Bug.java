/**************************** 
 * Marc Armstrong
 * September 25, 2008
 * Lab 1 - P3.9
 *****************************/
public class Bug
{
  private int position;
  private int direction;
  
  public Bug(int initPosition)
  {
    position = initPosition;
    direction = 1;
  }
  
  public void move()
  {
    direction += 1;
  }//end move method
  
  public void turn()
  {
    direction += -1;
  }//end turn method
  
  public int getPosition()
  {
    return position;
  }//end getPosition method 
}//end Bug class
    