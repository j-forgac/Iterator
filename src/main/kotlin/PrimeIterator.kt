fun MutableList<Int>.getPrimeNumber(): Int{
    var num = this.last()+1
    while (true){
        if(this.none { num%it == 0 }){
            this.add(num)
            return num
        }
        num++
    }
}

class PrimeIterator(private val maxCount: Int): Iterator<Int> {
    val primeNumbers = mutableListOf(2)

    var counter = 0

    override fun hasNext(): Boolean = counter < maxCount

    override fun next(): Int {
        check(hasNext()) {"Already gone through $maxCount"}
        counter++
        return primeNumbers.getPrimeNumber()
    }

}