package prova1.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstadiaTest {

    private Estadia est1;

    @BeforeEach
    public void setUp() throws Exception {
        est1 = new Estadia();
        est1.setPeriodo(Periodo.ALTA_TEMPORADA);
        est1.setQuantidadeDias(8);
    }

    @Test
    public void testPrecoPagar() {
        double expectedPreco = 1411.20;
        double actualPreco = est1.precoPagar();
        assertEquals(expectedPreco, actualPreco, 0.01, "O preço calculado deve ser igual ao esperado");
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Clean up resources if needed
        est1 = null;
    }
}
