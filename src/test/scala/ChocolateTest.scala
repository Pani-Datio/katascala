// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class ChocolateTest extends FlatSpec with Matchers {
  "breakChocolate(5, 5)" should "return 24" in {
    Chocolate.breakChocolate(5, 5) should be (24)
  }
  "breakChocolate(7, 4)" should "return 27" in {
    Chocolate.breakChocolate(7, 4) should be (27)
  }
}