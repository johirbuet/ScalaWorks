

object Shape {
  private class Circle(radius: Double) extends shapeTrait{
   override val area=3.14*radius*radius; 
  }
  
  private class Rectangle(height : Double, width:Double) extends shapeTrait
  {
    override val area=height*width;
  }
  
  def apply(height: Double, width: Double) : shapeTrait= new Rectangle(height,width)
  def apply(radius: Double) : shapeTrait=new Circle(radius);

  def main(args: Array[String]): Unit = {
     val circle=Shape(2);
     val rectangle=Shape(5,6);
     println(circle.area);
     println(rectangle.area);
     
  }
}