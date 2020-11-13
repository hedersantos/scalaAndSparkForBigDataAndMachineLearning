/*-----------------------------------------------------------------------------

    "For Loops" general format:

    for(item <- iterable_sequence){
        do something
    }

    Notice how "<-" represents an "IN" operator.

-----------------------------------------------------------------------------*/

for(item <- List(1,2,3)){
    println(item)
}

// iterating and checking conditions example

for(num <- Range(0,10)){
    if (num % 2 == 0) {
        println(f"$num is even.")
    } else {
        println(f"$num is odd.")
    }    
}

// iterating and checking conditions 

val names = List("John","Abe","Cindy","Cat")

for (name <- names) {
    if (name.startsWith("C")) {
        println(f"$name starts with 'C'.")
    }
}