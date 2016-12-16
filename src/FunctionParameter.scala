

object FunctionParameter {
  def operation(functionparam:(Int,Int) => Int){
    println(functionparam(4,4));
  }
  val add = (x :Int, y:Int)=>{x+y}
  operation(add)
}