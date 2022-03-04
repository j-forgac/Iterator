fun main(){
    val primeNumberIterator = Iterable { PrimeIterator(2200) }
    for(v in primeNumberIterator){
        println(v)
    }
}