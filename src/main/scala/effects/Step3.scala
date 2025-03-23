package lv.id.jc
package effects

object Step3 {

  val greet: Console[Unit] = for {
    _ <- Console.printLine("What is your name?")
    name <- Console.readLine()
    _ <- Console.printLine(s"Hello, $name")
  } yield ()

  def main(args: Array[String]): Unit = {
    greet.run()
  }

}
