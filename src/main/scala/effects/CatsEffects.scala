package lv.id.jc
package effects

import cats.effect.{IO, IOApp}

import scala.io.StdIn

object CatsEffects extends IOApp.Simple {

  val greet: IO[Unit] = for {
    _ <- IO.println("What is your name?")
    name <- IO.delay(StdIn.readLine())
    _ <- IO.println(s"Hello, $name")
  } yield ()

  val askForAge: IO[Unit] = for {
    _ <- IO.println("How old are you?")
    age <- IO.delay(StdIn.readInt())
    message = if (age >= 18) "You are an adult" else "You are still a child"
    _ <- IO.println(message)
  } yield ()

  def run: IO[Unit] = greet >> askForAge
}
