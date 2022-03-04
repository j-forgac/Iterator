val primeNumbers = mutableListOf(2)

fun Int.getPrimeNumber(): Int{
    var num = primeNumbers.last()+1
    while (true){
        if(primeNumbers.none { num%it == 0 }){
            primeNumbers.add(num)
            return num
        }
        num++
    }
}

class PrimeIterator(private val maxCount: Int): Iterator<Int> {

    var counter = 0

    override fun hasNext(): Boolean = counter < maxCount

    override fun next(): Int {
        check(hasNext()) {"Already gone through $maxCount"}
        counter++
        return counter.getPrimeNumber()
    }

}