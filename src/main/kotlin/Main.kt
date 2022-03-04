fun main(){
    val primeNumberIterator = Iterable { PrimeIterator(10) }
    for(v in primeNumberIterator){
        println(v)
    }
}