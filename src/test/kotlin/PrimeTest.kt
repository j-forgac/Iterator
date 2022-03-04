import org.junit.Assert
import org.junit.Test
import java.io.File

class PrimeTest {
    val testInput = File("./src/test/kotlin/primeNumList.txt").readLines().map{it.toInt()}
    val iterator = PrimeIterator(2200).asSequence().toList()

    @Test
    fun testSize() {
        Assert.assertEquals(testInput,iterator)
    }
}