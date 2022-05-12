import org.junit.Test;

public class testcalculadora extends Calculadora{
    @Test
    public void testcalculadora(){
        suma((float)2,(float)1);
        resta((float)2,(float)1);
        multiplicar((float)2,(float)1);
        dividir((float)2,(float)1);
    }
}
