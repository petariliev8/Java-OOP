package _3_working_with_abstractions.Rectangle;

public class Rectangle {
   private Point bottomLeft;
   private Point topRight;

   public Rectangle (Point bottomLeft,
                     Point topRight  ){
      this.bottomLeft = bottomLeft;
      this.topRight = topRight;

   }

   public boolean contains (Point input){
       boolean isItIn = false;
        int rowsBegin = this.bottomLeft.getX();
        int rowsEnd =  this.topRight.getX();
        int columnsBegin = this.bottomLeft.getY();
        int columnsEnd = this.topRight.getY();

        if(!(input.getX() < rowsBegin ||
        input.getX() > rowsEnd  ||
        input.getY() < columnsBegin ||
       input.getY() > columnsEnd)){
            isItIn = true;
        }
        return isItIn;
   }
}
