package euler

object problem4 extends App{
    var p = 0
    var largest = 0
    var pair = (0,0)
    for(x <- 100 to 999){
        for(y <- 100 to 999){
            p = x * y
            if(ispalindrome(p)){
                if(p>largest){ largest = p; pair = (x,y)}
            }
        }
    }
    println(pair)
    println(largest)

    def ispalindrome(x: Int): Boolean = {
        val c = x.toString
        if(c == c.reverse) true
        else false
    }
}