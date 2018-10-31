object Scoring {
  def high(s: String): String = {
    s.split(' ').map(score).zipWithIndex.sortBy(x => (x._1._2, - x._2)).last._1._1
  }

  def score(str:String):(String,Int) = (str,str.map(index).reduce(_+_))

  def index(c: Char): Int = "abcdefghijklmnopqrstuvwxyz".indexOf(c) + 1

}