import org.scalatest.{MustMatchers, WordSpec}

class NinetyNineProblemsSpec extends WordSpec with MustMatchers {

  "NinetyNineProblems" must {
    "returnLastElementInList(List(1,2,3,4,5) must return 5" in {
      NinetyNineProblems.returnLastElementInList(List(1, 2, 3, 4, 5)) mustEqual 5

    }
    "return last but one element in list - return 4 from list input List(1,2,3,4,5)" in {
      NinetyNineProblems.retSecondLastInList(List(1, 2, 3, 4, 5)) mustEqual 4
    }
    "return nth element in - list return 4 from list input(2,List(1,2,3,4,5)" in {
      NinetyNineProblems.retNthInList(2, List(1, 2, 3, 4, 5)) mustEqual 3
    }
    "return length of return 5 from list input List(1,2,3,4,5)" in {
      NinetyNineProblems.retListLength(List(1, 2, 3, 4, 5)) mustEqual 5
    }
    "reverse a list return List(5,4,3,2,1) from list input(2,List(1,2,3,4,5)" in {
      NinetyNineProblems.reverseList(List(1, 2, 3, 4, 5)) mustEqual List(5, 4, 3, 2, 1)
    }
    "find whether a list is a palindrome eg 121 or 12321" in {
      NinetyNineProblems.palindromeTest(List(1, 2, 3, 2, 1)) mustEqual true
    }
    "return List(1,1,2,3,5,8) input (List(List(1, 1), 2, List(3, List(5, 8))))" in {
      NinetyNineProblems.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) mustEqual List(1, 1, 2, 3, 5, 8)
    }
    "return List(a,b,c,a,d,e) input (List (a,a,a,b,c,c,a,a,d,e,e,e,e))" in {
      NinetyNineProblems.eliminateDuplicates(List('a','a','a','b','c','c','a','a','d','e','e','e','e')) mustEqual List('a','b','c','a','d','e')
    }
  }
}
