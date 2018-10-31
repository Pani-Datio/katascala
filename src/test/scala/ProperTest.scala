// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class ProperTest extends FlatSpec with Matchers {
  "properFractions(1)" should "return 0" in {
    Proper.properFractions(1) should be (0)
  }
  "properFractions(2)" should "return 1" in {
    Proper.properFractions(2) should be (1)
  }
  "properFractions(5)" should "return 4" in {
    Proper.properFractions(5) should be (4)
  }
  "properFractions(15)" should "return 8" in {
    Proper.properFractions(15) should be (8)
  }
  "properFractions(25)" should "return 20" in {
    Proper.properFractions(25) should be (20)
  }
}

