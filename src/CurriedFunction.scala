

object CurriedFunction extends App {
  def curriedAdd(a:Int)(b:Int)=a+b;
  println(curriedAdd(10)(15))
}