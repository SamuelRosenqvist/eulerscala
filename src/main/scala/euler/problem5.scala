package euler

object problem5 extends App {
    var nbr = 1
    var xt = 0
    val v = Vector.range(1,21)
    var m = scala.collection.mutable.Map[Int,Int]()
    v.foreach(i => m += (i -> 0))
    val primes = Vector(2,3,5,7,11,13,17,19)
    var t = 0

    for(x <- 2 to 20){
        xt = x
        for(p <- primes){
            while(xt%p == 0){
                xt = xt/p
                t+=1
            } 
            if(t > m(p)) m(p) = t
            t=0
            }
    }
    m.foreach(p => nbr *= scala.math.pow(p._1,p._2).toInt)
    println(nbr)
}