package ch03

object Example extends App {
  def stringMatch(s: String): String = {
    s match {
      case s: String if s.length > 0 => s
      case _ => "n/a"
    }
  }

  def doubleMatchUsingIf(d: Double): String = {
    if(d > 0)
      "greater"
    else {
      if (d == 0)
        "same"
      else
        "less"
    }
  }

  def doubleMatchUsingMatch(d: Double): String = {
    d match {
      case _ if d > 0 => "greater"
      case _ if d == 0 => "same"
      case _ => "less"

    }
  }

  def print1To100(): Unit = {
    val listTo5 = for(i <- 1 to 5) yield i
    val listTo20 = for(i <- 1 to 20) yield i

    val list5Size = listTo5.size
    listTo20
      .map{
        i => listTo5.map(j => list5Size * (i - 1) + j).mkString("", ",", ",")
      }
      .foreach(println)
  }

  println(s"1. StringMatch With Not Empty: ${stringMatch("test")}")
  println(s"1. StringMatch With Empty: ${stringMatch("")}")

  println(s"2. doubleMatchUsingIf(param: 1.0): ${doubleMatchUsingIf(1.0)}")
  println(s"2. doubleMatchUsingMatch(param: 1.0): ${doubleMatchUsingMatch(1.0)}")
  println(s"2. doubleMatchUsingIf(param: 0): ${doubleMatchUsingIf(0)}")
  println(s"2. doubleMatchUsingMatch(param: 0): ${doubleMatchUsingMatch(0)}")
  println(s"2. doubleMatchUsingIf(param: -1): ${doubleMatchUsingIf(-1)}")
  println(s"2. doubleMatchUsingMatch(param: -1): ${doubleMatchUsingMatch(-1)}")

  println("4. print 1 to 100")
  print1To100()
}
