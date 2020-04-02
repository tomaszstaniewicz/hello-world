package lectures.part2oop

object MethodsNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def hangsOutWith(person: Person): String = s"${this.name} hangs out with ${person.name}"
    def unary_! : String = "! works for person class"
    def isAlive(): Boolean = true
    def apply(): String = s"Hi, my name is $name"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // infix notation

  val tom = new Person("Tom", "Titanic")
  println(mary hangsOutWith tom) // infix notation

  // prefx notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  println(!mary)
  // unary prefix works only with - + ~ !

  // postfix notation - only for methods with no parameters
  println(mary.isAlive())
  println(mary isAlive)

  // apply method
  println(mary.apply())
  println(mary())
}
