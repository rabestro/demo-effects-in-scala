package lv.id.jc
package effects

object Step2 {
  val greet: Console[Unit] =
    Console.printLine("What is your name?").flatMap { _ =>
      Console.readLine().flatMap { name =>
        Console.printLine(s"Hello, $name")
      }
    }

  def main(args: Array[String]): Unit = {
    greet.run()
  }
}
