// declare value
val x = "zzz"

// check condition
if (x.endsWith("o")){
    println("The value of 'x' ends with 'o'.")
} else {
    println("The value of 'x' doesn't end with 'o'.")
}

/*
    Checking for multiple conditions with "if", "else if" and "else"
*/

val person = "Heder"

if (person == "Sammy"){
    println("welcome Sammy")

} else if (person == "George") {
    println("welcome George!")

} else {
    println("What's your name?")
}

/*
    Other logical operators

    AND = && (double ampersand)
    OR = || (double pipe)
    NOT = ! (exclamation mark)
*/

// AND operator example
println((1 == 1) && (2 == 2))

// OR operator example
println((1 == 2) || (2 == 2))

// NOT operator example
println(!(1 == 1))

