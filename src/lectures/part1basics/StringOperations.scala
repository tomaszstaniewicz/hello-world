package lectures.part1basics

object StringOperations extends App {

  val aNumberString = "45"
  println('a' +: aNumberString :+ 'z')
  println(aNumberString.reverse)
  println(aNumberString.take(1))

  // F-interpolators
  val speed = 1.2f
  val name = "Tomek"
  println(f"$name%s can eat $speed%2.2f burgers per minute")

  // raw interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
