package euler

object problem7 extends App {

    //Find 10001st prime number
    
    var p = 1

    for(i <- 1 to 10001){
        p = nextprime(p)
    }
    println(p)


    def isprime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

    def nextprime(n: Int): Int = {
        var x = n+1
        while(!isprime(x)){
            x += 1
        }
        x
    }
}