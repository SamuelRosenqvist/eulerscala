package euler

object problem6 extends App {
    var sumOfSquare = 0
    var squareOfSum = 0

    for(i <- 1 to 100){
        sumOfSquare += scala.math.pow(i,2).toInt
        squareOfSum += i
    }
    println(scala.math.pow(squareOfSum,2).toInt-sumOfSquare)
}