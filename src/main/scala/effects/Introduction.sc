/**
 * Substitution model
 * 1. Local reasoning
 * 2. Reference transparency
 */

def sum(x: Int, y: Int): Int = x + y

// Example 1

val r1 = sum(1, 2)
val _ = 1 + 2 // 3

// Example 2

val r2 = sum(1, sum(2, 3))
val _ = sum(1, 2 + 3)
val _ = sum(1, 5)
val _ = 1 + 5 // 6


// The pure function may contain mutable variables inside
// (the mutable state is not visible outside)

def length[A](list: List[A]): Int = {
  var counter = 0
  list.foreach(_ => counter += 1)
  counter
}

// Functions with effects

// Example 3

def sum2(x: Int, y: Int): Int = {
  println(s"Args: $x, $y")
  x + y
}

val x = sum2(3, 4)

// Example 4

var i = 2
def inc(int: Int): Int = {
  int + i
}

inc(5)
