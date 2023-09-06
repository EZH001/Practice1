import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
//Задача 1
    val exercices = 13
    var exercisesSolved = 0
    exercisesSolved++
//--------------------------------

//Задача 2
    val myAge: Int = 18
    exercisesSolved++
//---------------------------------

//Задача 3
    var middleAge: Double = 18.0
    middleAge = (middleAge + 30.0)/2
    exercisesSolved++
//---------------------------------

//Задача 4
    val testNumber = 18
    val evenOdd = testNumber % 2
    exercisesSolved++
//C evenOdd ничего не случилось
//----------------------------------

//Задача 5
    var answer = 0
    answer+=1
    answer+=10
    answer*=10
    answer = answer shr 3
    exercisesSolved++
//Результат будет равен 3
//-----------------------------------

//Задача 6
    var age: Int
    age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved++
//Var
//-------------------------------------------

//Задача 7

//Код не написан, т.к мне надо сделать задание 9, а компилятор ругается
    exercisesSolved++
//answer1 = 4610; answer 2 = 5600; answer 3 = 4601
//-----------------------------------------------

//Задача 8
    5 * 3 - 4 / 2 * 2
// ((5 * 3) - ((4 / 2) * 2))
    exercisesSolved++
//-------------------------------------------

//Задача 9
    val a: Double = 10.0
    val b: Double = 79.0
    val average = a + b / 2
    exercisesSolved++
//----------------------------------------

//Задача 10
    val fahrenheit: Double = 97.88
    val  celcius = (fahrenheit - 32) / 1.8
    exercisesSolved++
//-----------------------------------------

//Задача 11
    val position = 49
    val row = position / 8
    val column = position % 8
    println(row)
    println(column)
    exercisesSolved++
//----------------------------------------

//Задача 12
    val degrees: Double = 75.0
    val radians = degrees * PI / 180
    exercisesSolved++
//------------------------------

//Задача 13
    val x1: Double = 5.0
    val y1: Double = 3.0
    val x2: Double = -3.0
    val y2: Double = -7.0
    val distance = sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))
    exercisesSolved++
//-------------------------------------------------------------------------
}