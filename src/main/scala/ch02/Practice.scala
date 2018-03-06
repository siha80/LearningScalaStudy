package ch02

import scala.util.matching.Regex

object Practice extends App {
  def cToF(x: Double): Double = {
    val val1 = x * 9 /5
    println(s"va1l type => ${val1.getClass}")
    val val2 = val1 + 32
    println(s"va12 type => ${val2.getClass}")
    val2
  }

  def toInt(d: Double): Int = {
    d.toInt
  }

  def getStringWithDoubhleValue(x: Double): String = {
    f"3. You oew $$$x%.2f"
  }

  def changeToChar(x: Int): Int = {
    val char = x.toChar
    char.toInt
  }

  def changeToString(x: Int): Int = {
    val str = x.toString
    str.toInt
  }

  def changeToDouble(x: Int): Int = {
    val double = x.toDouble
    double.toInt
  }

  def captureStringUsingRegex(s: String): String = {
    val pattern: Regex = """.*,(\d{3})-(\d{3})-(\d{4}),.*""".r
    val pattern(p1, p2, p3) = s
    s"$p1-$p2-$p3"
  }

  println(s"1. change temporature C to F and To Double => ${cToF(30.0)}")
  println(s"2. change temporature C to F and To Int => ${toInt(cToF(30.0))}")
  println(s"3. change double to string => ${getStringWithDoubhleValue(2.7255)}")
  println(s"4. simplify boolean => ${!false}")
  println(s"5. ToChar => ${changeToChar(128)}, ToString => ${changeToString(128)}, ToDouble => ${changeToDouble(128)}")
  println(s"6. Pick PhoneNumber => ${captureStringUsingRegex("Frank,123 Main,925-555-1923,95122")}")
}
