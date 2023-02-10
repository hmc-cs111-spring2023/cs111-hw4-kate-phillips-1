import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should._

class CollatzSpec extends AnyFunSuite with Matchers:

    test("Test 1") {
        collatz(6) should be(3)
    }

    test("Test 2") {
        collatz(7) should be(22)
    }
    test("Test 3") {
        collatz(1) should be(4)
    }

    test("Test 4") {
        collatz(2) should be(1)
    }

    test("Test 5") {
        collatz(42) should be(21)
    }

    test("Test 6") {
        collatz(101) should be(304)
    }



end CollatzSpec


class CollatzCountSpec extends AnyFunSuite with Matchers:

    test("Test 1") {
        collatzCount(1) should be(0)
    }

    test("Test 2") {
        collatzCount(101) should be(25)
    }
    test("Test 3") {
        collatzCount(1111) should be(31)
    }

    test("Test 4") {
        collatzCount(267) should be(21)
    }


end CollatzCountSpec
