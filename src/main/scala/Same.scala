object Same {
  def comp(seq1: Seq[Int], seq2: Seq[Int]) = {
    if (seq1 != null && seq2!= null) {
      val newArray = for (item <- seq1) yield item * item
      newArray.sorted == seq2.sorted
    }else null
  }
}
