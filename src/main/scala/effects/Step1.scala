package lv.id.jc
package effects

object Step1 {
  val greet = {
    Console.printLine("What is your name?").run()
    val name = Console.readLine().run()
    Console.printLine(s"Hello, $name").run()
  }

  def main(args: Array[String]): Unit = {
    greet
  }
}
