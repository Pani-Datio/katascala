object Potatoes {

  def potatoes(p0: Int, w0: Int, p1: Int): Int = {
    val result = ((((100 - p0)*w0)/100) + (p1*w0)/100)
    result.toInt
  }
}