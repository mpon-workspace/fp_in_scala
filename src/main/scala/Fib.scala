import scala.annotation.tailrec

/**
  * Created by mpon on 2016/05/13.
  */
object Fib {


  // f(0)               = 0
  // f(1)               = 1
  // f(2) = f(0) + f(1) = 1
  // f(3) = f(1) + f(2) = 2
  // f(4) = f(2) + f(3) = 3
  // f(5) = f(3) + f(4) = 5
  // f(6) = f(4) + f(5) = 8
  def fib1(n: Int): Int = {

    def go(n: Int): Int = n match {
      case 0 => 0
      case 1 => 1
      case _ => go(n - 2) + go(n - 1)
    }
    go(n)
  }

  // f(0)                      = 0
  // f(1)                      = 1
  // f(2) = f(0) + f(1)        = 1
  // f(3) = f(1) + f(0) + f(1) = 2
  // f(4) = f(2) + f(1) + f(2) = 3
  // f(5) = f(3) + f(2) + f(3) = 5
  // f(6) = f(4) + f(3) + f(4) = 8
  def fib2(n: Int): Int = {

    @tailrec
    def go(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => go(n - 1, b, a + b)
    }
    go(n, 0, 1)
  }
}
