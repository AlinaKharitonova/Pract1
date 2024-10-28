import kotlin.math.PI
import kotlin.math.*
fun main() {
    // 1
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved +=1

    //2
    val ageAlina: Int = 18
    exercisesSolved +=1

    //3 Среднее арифметическое
    var ageStudent: Double = 18.0
    var afg = (ageStudent + 30)/2
    println("$afg")
    exercisesSolved +=1

    //4
    val testNumber = 11
    val evenOdd = testNumber % 2
    println(evenOdd)
    exercisesSolved +=1

    //5 Матем-кие вычисления и смещение в право
    var answer = 0
    answer +=1
    answer +=10
    answer *=10
    answer shr 3
    println(answer)
    exercisesSolved +=1

    //6
    var age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved +=1

    //7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 100)
    println("$answer1, $answer2, $answer3")
    exercisesSolved +=1

    //8 Правильно раставить скобки
    (5 * 3) - ((4 / 2) * 2)
    exercisesSolved +=1

    //9 Среднее арифметическое
    val a1 : Double = 5.0
    val b1 :Double = 7.0
    val average = (a1 + b1)/2
    println(average)
    exercisesSolved +=1

    //10 Температура
    val fahrenheit = 125.0
    val celcius = (fahrenheit - 32) / 1.8
    println ("%.4f".format(celcius))
    exercisesSolved +=1

    //11 Координаты на поле 8 на 8
    val position = 41
    val row = position / 8
    val column = position % 8
    println("$position находится в строке $row, в столбце $column")
    exercisesSolved +=1

    //12 Угол в радианах
    val degrees : Double = 25.0
    val radians = degrees * (PI / 180)
    println ("%.4f".format(radians))
    exercisesSolved +=1

    //13 Расстояние между 2 точками
    val x1: Double = 5.0
    val y1: Double = 2.0
    val x2: Double = 1.0
    val y2: Double = 7.0
    val distance: Double = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    println ("%.4f".format(distance))
    exercisesSolved +=1
    println("Выполнено $exercisesSolved заданий")
}