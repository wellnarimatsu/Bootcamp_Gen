import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

  internal  class CalculadoraTest {

    @Test
    fun adicaoTest(){
        assertEquals(7.0,Calculadora.adicao(3.0,4.0))
    }
    @Test
    fun subtracaoTest(){
        assertEquals(5.0,Calculadora.subtracao(7.0,2.0))
    }
    @Test
    fun divisaoTest(){
        assertEquals(2.0,Calculadora.divisao(10.0,2.0))
    }
    @Test
    fun multiplicacaoTest(){
        assertEquals(72.0,Calculadora.multiplicacao(8.0,9.0))
    }
}