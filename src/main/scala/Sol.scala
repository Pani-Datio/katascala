object Sol {
  def factorial(n: Int): Option[BigInt] = {
    if(n < 0) None
    else if(n == 0) Some(1)
    else {
      val nAsBigInt = (1 to n).map(x => scala.BigInt(x))
      Some(nAsBigInt.reduce(_*_))
    }
  }
}