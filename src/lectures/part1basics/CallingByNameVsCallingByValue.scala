package lectures.part1basics

object CallingByNameVsCallingByValue extends App {

  def callByValue(x: Long): Unit = {
    println(s"by value $x")
    println(s"by value $x")
  }

  // evaluating is lazy - if t's not used in function then it won't be evaluated
  def callByName(x: => Long): Unit = {
    println(s"by name $x")
    println(s"by name $x")
  }

  println(callByValue(System.nanoTime()))
  println(callByValue(System.nanoTime()))
  println(callByName(System.nanoTime()))
  println(callByName(System.nanoTime()))
}
