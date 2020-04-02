package lectures.part1basics

import scala.annotation.tailrec

object TailrecFunctions extends App {

  def concatenate(string: String, n: Int): String = {
    @tailrec
    def accumulate(n: Int, accumulator: String): String = {
      if (n <= 1) accumulator
      else accumulate(n-1, accumulator + string)
    }

    accumulate(n, string)
  }

  println(concatenate("string", 10))

  def fibbonacci(n: Int): Int = {
    @tailrec
    def fibbonacciTailrec(i: Int, lastButOne: Int, last: Int): Int = {
      if (i >= n) last
      else fibbonacciTailrec(i + 1, last, lastButOne + last)
    }

    if (n <= 2) 1
    else fibbonacciTailrec(2, 1, 1)
  }

  println(fibbonacci(7))
}
