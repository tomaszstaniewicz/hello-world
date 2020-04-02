package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // expression
  println(x)

  println(2 + 3 * 4)

  // instructions (DO) vs expressions (returns value)

  // of expressions
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 // if expression
  println(aConditionValue)

  var i = 0
  // never do this
  while (i < 10) {
    println(i)
    i += 1
  }

  var aVariable = 1
  val aWeirdValue = (aVariable = 3) // Unit === void

  // side effects: prinln(), whiles, reasigning

  // code blocks

  // vals and vars defined in code block are not visible outside code block
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye" // a code block value is a value of it's last expression
  }

  println(aCodeBlock)

}
