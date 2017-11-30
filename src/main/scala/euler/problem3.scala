package euler

object problem3 extends App {
    var p = 600851475143L
    var lpf = 1
    var n = 2
    
    while(p>n){
        println("test " + n)
        if(p%n==0) {
            p = p/n
            lpf = n
            }
            else n = nextprime(n)
    }
    if(lpf > n) println(lpf)
    else println(n)
    
    def nextprime(n: Int): Int = {
        var x = n+1
        while(!isprime(x)){
            x += 1
        }
        x
    }

    def isprime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))
}