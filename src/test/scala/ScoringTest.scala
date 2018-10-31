import org.scalatest._

class ScoringTest extends FlatSpec with Matchers {
//  """high("man i need a taxi up to ubud")""" should """return "taxi" """ in {
//    Scoring.high("man i need a taxi up to ubud") should be ("taxi")
//  }
//  """high("what time are we climbing up to the volcano")""" should """return "volcano" """ in {
//    Scoring.high("what time are we climbing up to the volcano") should be ("volcano")
//  }
//  """high("take me to semynak")""" should """return "semynak" """ in {
//    Scoring.high("take me to semynak") should be ("semynak")
//  }
  """high("for equals return earliestg")""" should """return "return" """ in {
    Scoring.high("for equals return earliestg") should be ("return")
  }
//  """high("find or finda")""" should """return "finda" """ in {
//    Scoring.high("find or finda") should be ("finda")
//  }
}