package lv.id.jc
package effects

case class IO[A](run: () => A) {
  def map[B](f: A => B): IO[B] =
    flatMap(a => IO.effect(f(a)))

  def flatMap[B](f: A => IO[B]): IO[B] =
    IO.effect(f(this.run()).run())
}

private object IO {
  def effect[A](e: => A): IO[A] = IO(() => e)
}

