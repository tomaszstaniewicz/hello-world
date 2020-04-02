package lectures.part2oop

object Objects extends App {

  // Scala objects are their own classes and are singletons
  // object complied to java bytecode is a normall class with $ suffix
  // i.e. Person$
  object Person {
    val a = 10
    val b = 10

    def apply(name: String, age: Int): Person = new Person(name, age)
  }

  // scala companions
  // - can access each other's private members
  class Person(val name: String, val age: Int) {
    override def toString: String = s"Person: name: ${name}, age ${age}"
  }

  println(Person("Tomasz", 10))
}
