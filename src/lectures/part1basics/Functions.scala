package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("helolo", 3))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  println(aBigFunction(2))

  def aGreetingFunction(name: String, age: Int): String = {
    s"Hello my name is $name and I am $age years old"
  }

  println(aGreetingFunction("Tomek", 28))

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(5))

  def fibbonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibbonacci(n - 1) + fibbonacci(n - 2)
  }

  println(fibbonacci(5))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      !(
          if (t <= 1) false
          else n % t == 0 || isPrimeUntil(t - 1)
       )
    }

    isPrimeUntil(n - 1)
  }

  println("---is prime---")
  println(isPrime(12))
  println(isPrime(13))
  println(isPrime(23))
  println(isPrime(24))
}
