/*-----------------------------------------------------------------------------

    Demonstrate how to declare and use functions in Scala.

    Below there's a function declaration example:

    def functionName(argName: argNameType): outputType = {
        code block
    }

    NOTICE both input arguments and function output data types are set upfront,
making debugging clearer.

-----------------------------------------------------------------------------*/

def simple(): Unit = {
    // "Unit" is a general data type, used as expected output type here
    println("simple print")
}

// function call
simple()

// setting arguments and their data types
def adder(num1: Int, num2: Int): Int = {

    // use "return" keyword just like Python's
    return num1 + num2
}

// function calls
adder(4,5)

adder("4",5)

// another simple function manipulating a String object
def greetName(name: String): String = {
    return s"Hello $name!"
}

// assign function output to a Value
val fullGreet = greetName("Heder")

println(fullGreet)

// naive approach to determine whether a given number is prime
def isPrime(numCheck: Int): Boolean = {

    // the first "return" keyword reached determines function end, just like
    // Python's.

    for(denominator <- Range(2, numCheck)) {

        if (numCheck % denominator == 0) {
            // number is not Prime
            return false
        }
    }
    // number is prime if it's only divisible by 1 and itself.
    return true
}

for (number <- List(10,13,15,17,23)) {
    println(s"Is $number prime?",isPrime(number))
}

// it's also possible to both receive and output collections
val numbers = List(1,2,3,7)

// notice input and outputs data types are both set to List objects
def checkCollection(nums: List[Int]): List[Int] = {
    return nums
}


