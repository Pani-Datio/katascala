object Proper {

  def properFractions(n: Long): Long = {
    if (n > 1){
//      longRange(0, n).map(x => gcd(x,n)).filter(_ == 1).sum
//        (1L to n).map(x => gcd(x,n)).filter(_ == 1).sum
      var i = 1L
      var counts = 0L
      while(i < n){
        if(gcd(i,n) == 1) counts+=1
        i+=1
      }
      counts
    }
    else 0
  }

//  def longRange(first: Long, last: Long) = new Iterator[Long] {
//    private var i = first
//    def hasNext = i < last
//    def next = {val r = i; i += 1; r}
//  }

  def gcd(a: Long,b: Long): Long = {
    if(b ==0) a else gcd(b, a%b)
  }

//  def calculateGCDfor(a: BigInt, b: BigInt): BigInt = {
//    if (b == BigInt(0)) a
//    else {
//      if(a > b) calculateGCDfor(b, a - b * (a / b))
//      else calculateGCDfor(a, b - a * (b / a))
//    }
//  }

}