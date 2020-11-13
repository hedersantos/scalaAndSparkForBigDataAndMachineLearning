/*-----------------------------------------------------------------------------
    Demonstrate how to use Scala's "while" loops.
-----------------------------------------------------------------------------*/

// Scala has no built-in "break" functionality so you'll have to import it
import util.control.Breaks._

var x = 0

while(x < 5){
    println(s"'x' contains $x")

    x += 1
}

// while loop with a "break" condition
var y = 0

while (y < 10) {
    println(s"'y' equals $y")

    // increment "y" variable
    y += 1

    // simple break condition
    if (y == 3) break
}