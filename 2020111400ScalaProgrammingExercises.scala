/*-----------------------------------------------------------------------------
1.) Check for Single Even:
Write a function that takes in an integer and returns a Boolean indicating whether
or not it is even. See if you can write this in one line!
-----------------------------------------------------------------------------*/

def checkForSingleEven(input: Int): Boolean = {
    // use modulo operator to determine whether input is even or odd
    // return true if even
    return input % 2 == 0
}

checkForSingleEven(1)

checkForSingleEven(80)

checkForSingleEven(27)

// this same function could alse be written as a one-liner like this
def checkEven(input: Int) = input % 2 == 0

checkEven(1)
checkEven(2)

/*-----------------------------------------------------------------------------
2.) Check for Evens in a List:
Write a function that returns True if there is an even number inside of a List,
otherwise, return False.
-----------------------------------------------------------------------------*/

import util.control.Breaks._

def listContainsEvenNumber(inputList: List[Int]): Boolean = {

    // loop through list elements
    for (element <- inputList) {

        if (element % 2 == 0) {
            // list has at lest one even number: return true
            return true
        }
    }
    // list has no even numbers: return false
    return false
}

listContainsEvenNumber(List(1,3,5,11))

listContainsEvenNumber(List(1,3,6,20))

/*-----------------------------------------------------------------------------
3.) Lucky Number Seven:
Take in a list of integers and calculate their sum. However, sevens are lucky
and they should be counted twice, meaning their value is 14 for the sum. Assume
the list isn't empty.
-----------------------------------------------------------------------------*/

def luckyNumberSeven(inputList: List[Int]): Int = {

    // initialize summation variable
    var summation = 0

    // iterate on list elements
    for (element <- inputList) {

        // check for "lucky" elements
        if (element == 7) {
            summation += element * 2
        } else {
            summation += element
        }
    }
    // return summation
    return summation
}

luckyNumberSeven(List(1,2,3))

luckyNumberSeven(List(1,2,7))

luckyNumberSeven(List(10,7,10,7))

/*-----------------------------------------------------------------------------
4.) Can you Balance?
Given a non-empty list of integers, return true if there is a place to
split the list so that the sum of the numbers on one side
is equal to the sum of the numbers on the other side. For example, given the
list (1,5,3,3) would return true, you can split it in the middle. Another
example (7,3,4) would return true 3+4=7. Remember you just need to return the
boolean, not the split index point.
-----------------------------------------------------------------------------*/

def canYouBalance(inputList: List[Int]): Boolean = {

    // start list's first half summation variable as zero 
    var firstHalf = 0
    // start "secondHalf" variable as total List sum
    var secondHalf = inputList.sum

    // iterate over inputList elements
    // REMEMBER: Range() does not include its upper bound value
    for (index <- Range(0,inputList.length)){

        // add up current position value to "firstHalf" variable
        firstHalf += inputList(index)
        // subtract current position value from "secondHalf" variable
        secondHalf -= inputList(index)

        // check for equality and return true if both halves are equal
        if (firstHalf == secondHalf) {
            return true
        }
    }

    return false
}

canYouBalance(List(1,2,3))
canYouBalance(List(1,2,4))

/*-----------------------------------------------------------------------------
5.) Palindrome Check
Given a String, return a boolean indicating whether or not it is a palindrome.
(Spelled the same forwards and backwards). Try exploring methods to help you.
-----------------------------------------------------------------------------*/

def palindromeCheck(inputStr: String): Boolean = {
    // use List's "reverse" method and check its results against original List
    return (inputStr == inputStr.reverse)
}

palindromeCheck("ana")

palindromeCheck("heder")