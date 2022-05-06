package teine_osa;

import org.junit.Test;

import static org.junit.Assert.*;

public class JoogivaatTests {
    @Test
    public void t2idaPudelKuiSaab(){
        Joogipudel joogipudel = new Joogipudel(0.5, "plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogipudel);
        assertTrue(isT2idetud);
    }

    @Test
    public void t2idaPudelKuiEiSaa(){
        Joogipudel joogipudel = new Joogipudel(0.5, "plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        boolean isT2idetud = joogivaat.t2idaJoogipudel(joogipudel);
        assertFalse(isT2idetud);
    }

    @Test
    public void villidaSaabNull(){
        Joogipudel joogipudel = new Joogipudel(0.5, "plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 0.3);
        int pudeliteArv = joogivaat.villiPudelid(joogipudel);
        assertEquals(0, pudeliteArv);
    }

    @Test
    public void villidaSaabRohkemKuiNull(){
        Joogipudel joogipudel = new Joogipudel(0.5, "plastik", 0.2, 0.1);
        Joogivaat joogivaat = new Joogivaat(12.0, 3);
        int pudeliteArv = joogivaat.villiPudelid(joogipudel);
        assertEquals(6, pudeliteArv);
    }
}
