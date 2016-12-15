

object Ranges {
  def main(args: Array[String]): Unit = {
    println("to: ");
    for{i<- 1 to 5}
    println(i)
    println("until: ");
     for{i<- 1 until 5}
    println(i)
    println("by");
     for{i<- 1 to 20 by 4}
    println(i)
  }
}