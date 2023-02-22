package exercices.purefunctions

import scala.util.Random

object PureFunction {

  def parseInt(s: String): Int = s.toInt

  def pureParseInt(s: String) = ???

  def zioParseInt(s: String) = ???

  def addOne(x: Int): Int = Random.nextInt(x) + 1

  def pureAddOne(x: Int): Int = ???

  def zioAddOne(x: Int) = ???
}
