package figuras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 3.0;
        Triangulo triangulo = new Triangulo("", base, altura);
        double retornoFeito = triangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
