object Solution {
  def backwardsPrime(start: Long, nd: Long): String = {
    var index = start
//    var result = ""
var result = List[String]()
    if(start < 10) index = start + 10

    for(x <- index to nd){
      if(stringIsPrime(x.toString) && stringIsPrime(x.toString.reverse)){
        //result = result.concat(x.toString + ",")
        result ::= x.toString
      }
    }
    //result.substring(0,result.length()-1)
    result.toString()
  }

  def stringIsPrime(a: String): Boolean = {
    val x = a.toDouble
    if(x <= 1) false
    else if(x == 2) true
    else !(2 to (x-1).toInt).exists(y => (x % y == 0))
  }
}