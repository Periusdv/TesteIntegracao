package figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraTest {
    
    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura retangulo = new Retangulo();
        retangulo.setCor("Verde");        
        assertEquals(retornoEsperado, retangulo.getCor());
    }
 }