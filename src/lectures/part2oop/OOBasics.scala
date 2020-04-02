package lectures.part2oop

object OOBasics extends App {
  val person = new Person("John", 26)
  println(person.age)
  println(person.x)

  val writer = new Writer("Tomasz", "Staniewicz", 1992)
  println(writer.fullname())
}

// constructor
// class parameters are not fields
// all vals declared in class block are class fields
class Person(name: String, val age: Int) {
  val x = 2 // val declarations are fields

  println(1 + 3)

  // overloading
  def greet(name: String): Unit = println(s"${this.name} says: Hi ${name}")
  def greet(): Unit = println(s"Hi, I ama $name")

  def printAge(): Unit = println(this.age)

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doc")
}

class Writer(val firstName: String, val surname: String, val year: Int) {
  def fullname(): String = s"firstName: ${firstName} surname: ${surname} year: ${year}"
}
