object NinetyNineProblems {


  def returnLastElementInList(input: List[Int]): Int = {

    input.reverse.head
  }

  def retSecondLastInList(input: List[Int]): Int = {
    input.reverse(1)
  }

  def retNthInList(key: Int, input: List[Int]): Int = {
    input(key)
  }

  def retListLength(input: List[Int]): Int = {
    input.length
  }

  def reverseList(input: List[Int]): List[Int] = {
    input.reverse
  }

  def palindromeTest(input: List[Int]): Boolean = {
    val listReverse = input.reverse
    input == listReverse
  }

  def flatten[A](input: List[A]): List[A] = {
    input flatMap {
      case x: List[A] => flatten(x)
      case e => List(e)
    }
  }
  def eliminateDuplicates(chars: List[Char]): List[Char]=  {
     def compressR(result: List[Char], curList: List[Char]): List[Char] = curList match {
    case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
    case Nil       => result.reverse
    }
    compressR(Nil, chars)
    }

}
