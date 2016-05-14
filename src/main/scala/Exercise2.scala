/**
  * Created by mpon on 2016/05/14.
  */
object Exercise2 {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def loop(n: Int): Boolean =
      if (n >= as.length) true
      else if (n == as.length - 1) true
      else if (ordered(as(n), as(n + 1))) loop(n + 1)
      else false

    loop(0)
  }

  def test = {

    val as0 = Array[Int]()
    val ret0 = isSorted[Int](as0, (x, y) => x < y)
    assert(ret0)

    val as1 = Array(1)
    val ret11 = isSorted[Int](as1, (x, y) => x < y)
    val ret12 = isSorted[Int](as1, (x, y) => x > y)
    assert(ret11)
    assert(ret12)


    val as2 = Array(1, 2, 3)
    val ret21 = isSorted[Int](as2, (x, y) => x < y)
    val ret22 = isSorted[Int](as2, (x, y) => x > y)
    assert(ret21)
    assert(!ret22)

    val as3 = Array("A", "B", "C")
    val ret31 = isSorted[String](as3, (x, y) => x < y)
    val ret32 = isSorted[String](as3, (x, y) => x > y)
    assert(ret31)
    assert(!ret32)

    val as4 = Array("C", "B", "A")
    val ret41 = isSorted[String](as4, (x, y) => x < y)
    val ret42 = isSorted[String](as4, (x, y) => x > y)
    assert(!ret41)
    assert(ret42)

    val as5 = Array("A", "C", "B")
    val ret51 = isSorted[String](as5, (x, y) => x < y)
    val ret52 = isSorted[String](as5, (x, y) => x > y)
    assert(!ret51)
    assert(!ret52)
  }
}
