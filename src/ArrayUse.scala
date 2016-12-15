

object ArrayUse {
 
  def main(args: Array[String]): Unit = {
     var books=new Array[String](3);
     for{i<- 0 to 2}
     {
       books(i)=s"Book ${i}";
       println(books(i));
     }
  }
}