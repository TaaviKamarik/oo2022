package Isikukood;


import kujundid.Kolmnurk;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_algus_on_neli(){
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false,ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51(){
        IsikukoodLV lv = new IsikukoodLV("120351-51237");
        assertEquals(1951,lv.getBirthYear());
    }

    @Test
    public void kontrolli_kas_pindala_arvutatakse_korrektselt(){
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18,kolmnurk.arvutaPindala(),0.1);
    }


}
