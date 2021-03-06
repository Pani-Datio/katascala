import org.scalatest._
import org.scalatest.Assertions._

import PotatoesTest._

class PotatoesTest extends FlatSpec {
  it should "pass basic tests" in {
    dotest(82, 127, 80, 114);
    dotest(93, 129, 91, 100);
    dotest(82, 134, 77, 104);

  }
}

object PotatoesTest {
  private def dotest(p0: Int, w0: Int, p1: Int, expected: Int): Unit = {
    val output: String = "p0 %d w0 %d p1 %d".format(p0, w0, p1)
    println(output)
    val actual: Int = Potatoes.potatoes(p0, w0, p1)
    println("Actual: " + actual)
    println("Expect: " + expected)
    assertResult(expected){actual}
    println("-")
  }
}