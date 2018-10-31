import org.scalatest._

class ExesAndOhsTest extends FlatSpec with Matchers {

  val tests = List(
    ("xo", true),
    ("xo0", true),
    ("xxxoo", false),
    ("xoxEomGroooxobQCfoxLxxxNxxohoxxxoAdxoxJookxopoox",true)
  )

  tests.foreach {
    case (input, expected) =>
      s"xo($input)" should s"return $expected" in {
        ExesAndOhs.xo(input) should be (expected)
      }
  }
}