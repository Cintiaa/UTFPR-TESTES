package mediana;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CINTIA
 */
public class MedianaTest {
    
    public MedianaTest() {
    }

   @Test
   public void testaVetorOrdenadoImpar(){
       double v[] = {1, 2, 3, 4, 5};
       Mediana m = new Mediana();
       double res = m.getMediana();
       assertEquals(3.0, res, 0.01);
   }
}
