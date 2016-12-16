

object Function2 extends App{
  val areaRec: (Int,Int)=>Int=(width:Int,height:Int)=>{
    width*height;
  }
  println(areaRec(3,5));
  
}