package lv.id.jc
package effects

import scala.io.StdIn

object Functional {

  val greet: IO[Unit] = for {
    _ <- IO.effect(println("What is your name?"))
    name <- IO.effect(StdIn.readLine())
    _ <- IO.effect(println(s"Hello, $name"))
  } yield ()

  def main(args: Array[String]): Unit = {
    greet.run()
  }
}

