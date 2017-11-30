package euler

object problem2 extends App {
        var x = 1
        var y = 1
        var t = 0
        var sum = 0
        while(x<=4000000){
            t = x
            x = x+y
            y = t
            if(x%2==0) sum += x
        }
        println(sum)
}