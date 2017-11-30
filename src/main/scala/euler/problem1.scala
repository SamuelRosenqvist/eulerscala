package euler

object problem1 extends App {
        val v = Vector.range(1,1000)
        var x = 0
        for(t <- v){
            if(t%3==0||t%5==0)x+=t
        }
        println(x)
}