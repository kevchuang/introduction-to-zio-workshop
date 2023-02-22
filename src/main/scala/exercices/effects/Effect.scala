package exercices.effects

import zio._

trait MyIO[+A] {
  def flatMap[B](f: A => MyIO[B]): MyIO[B]
  def map[B](f: A => B): MyIO[B]
}

object MyIO {
  def effect[A](a: => A): MyIO[A] = ???
}

object Request {
  case class QueryObject(result: Any)

  class DbConnection() {
    def executeQuery(query: String): QueryObject = ???
  }

  def getSpotifyRevenue: Double = {
    val databaseConnection = new DbConnection()
    val query = "SELECT revenue FROM tReports WHERE store = 'Spotify'"

    val result = databaseConnection.executeQuery(query)

    result.asInstanceOf[Double]
  }

  def getSpotifyRevenueWithEffects: MyIO[Double] = ???

  def getSpotifyRevenueWithZio: ZIO[Nothing, Throwable, Double] = ???
}