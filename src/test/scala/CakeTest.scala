import org.scalatest.FlatSpec

class CakeTest extends FlatSpec {
  it should "work with example tests" in {
    assert(Cake.cakeSlice(0) == 1)
    assert(Cake.cakeSlice(1) == 2)
    assert(Cake.cakeSlice(2) == 4)
    assert(Cake.cakeSlice(3) == 7)
    assert(Cake.cakeSlice(10) == 56)
  }
}