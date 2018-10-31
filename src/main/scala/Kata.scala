object Kata {
  def orderedCount(chars: String): List[(Char, Int)] = {
    chars.distinct.toCharArray.map(x=>(x,chars.count(_==x))).toList
  }
}