import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculadora {
    @Test
    public void testComprueboSumaPositivos (){
        Assertions.assertEquals(1,Operaciones_Basicas.SUMA);
    }
    @Test
    public void testComprueboRestaPositivos(){
        Assertions.assertEquals(2,Operaciones_Basicas.RESTA);


    }
    @Test
    public void testComprueboDivisionPositivos(){
        Assertions.assertEquals(4,Operaciones_Basicas.DIVISION);
    }
    @Test
    public void testComprueboMultiplicacionPositivos(){
        Assertions.assertEquals(3,Operaciones_Basicas.MULTIPLICACION);
    }
    @Test
    public void testComprueboRaizPositivos(){
        Assertions.assertEquals(4,Operaciones_Basicas.DIVISION);
    }


}
