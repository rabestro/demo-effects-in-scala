package lv.id.jc
package effects

import scala.io.StdIn

object Imperative {

  val greet = {
    println("What is your name?")
    val name = StdIn.readLine()
    println(s"Hello, $name")
  }

  val askForAge = {
    println("How old are you?")
    val age = StdIn.readInt()
    if (age >= 18) println("You are an adult")
    else println("You are still a child")
  }

  def greetAndAskForAge(): Unit = ???

  def main(args: Array[String]): Unit = {
    greet
  }
}