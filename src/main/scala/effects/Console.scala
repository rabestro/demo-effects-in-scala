package lv.id.jc
package effects

import scala.io.StdIn

case class Console[A](run: () => A) {

  def map[B](f: A => B): Console[B] =
    flatMap(a => Console.succeed(f(a)))

  def flatMap[B](f: A => Console[B]): Console[B] =
    Console.succeed(f(this.run()).run())
}

object Console {
  def succeed[A](e: => A): Console[A] = Console(() => e)

  def printLine(s: String): Console[Unit] = Console(() => println(s))

  def readLine(): Console[String] = Console(() => StdIn.readLine())
}
