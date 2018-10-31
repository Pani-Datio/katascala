// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class EvaporatorTest extends FlatSpec with Matchers {
  "evaporator(10,10,10)" should "return 22" in {
    Evaporator.evaporator(10,10,10) should be (22)
  }
}