
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testcalculadora extends Calculadora{
    @Test
    public void testSuma(){
        float resultado=suma((float)2,(float)1);
        float esperado = 3;
        assertEquals(esperado, resultado);

    }
    @Test
    public void testResta(){
        float resultado=resta((float)2,(float)1);
        float esperado = 1;
        assertEquals(esperado, resultado);
        
    }
    @Test
    public void testmultiplicar(){
        float resultado=multiplicar((float)2,(float)1);
        float esperado = 2;
        assertEquals(esperado, resultado);
        
    }
    @Test
    public void testdividir(){
        float resultado=dividir((float)2,(float)1);
        float esperado = 2;
        assertEquals(esperado, resultado);
        
    }
    @Test
    public void test(){
        float resultado=multiplicar((float)2,(float)1);
        float resultado2=dividir((float)2,(float)1);
        assertEquals(resultado2, resultado);
        
    }
}
