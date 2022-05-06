package teine_osa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JoogiKastTest {

    @Test
    public void arvutaMass() {
        JoogiKast joogikast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("coca", 0.6, 1.4);
        Joogipudel joogipudel = new Joogipudel(12, "Klaas", 10.0, 0.3);
        joogipudel.jook = jook;
        joogikast.joogipudel = joogipudel;
        double mass = joogikast.getMass(20);
        assertEquals(2738.5, mass, 0.2);
    }

    @Test
    public void arvutaMassKuiRohkemKuiMahub() {
        JoogiKast joogikast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("coca", 0.6, 1.4);
        Joogipudel joogipudel = new Joogipudel(12, "Klaas", 10.0, 0.3);
        joogipudel.jook = jook;
        joogikast.joogipudel = joogipudel;
        double mass = joogikast.getMass(300);
        assertEquals(2738.5, mass, 0.2);
    }

    @Test
    public void arvutaHind() {
        JoogiKast joogikast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("coca", 0.6, 1.4);
        Joogipudel joogipudel = new Joogipudel(12, "Klaas", 10.0, 0.3);
        joogipudel.jook = jook;
        joogikast.joogipudel = joogipudel;
        double mass = joogikast.getHind(20);
        assertEquals(473.6, mass, 0.2);
    }

    @Test
    public void villinPudelidKasti() {
        JoogiKast joogikast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("coca", 0.6, 1.4);
        Joogipudel joogipudel = new Joogipudel(2, "Klaas", 10.0, 0.3);
        joogipudel.jook = jook;
        joogikast.joogipudel = joogipudel;
        Joogivaat joogivaat = new Joogivaat(312, 36);
        int kogus = joogikast.villiKastiPudelid(joogivaat);
        assertEquals(18, kogus, 0.2);
    }

    @Test
    public void villinPudelidKastiKuiOnTäis() {
        JoogiKast joogikast = new JoogiKast("Puit", 200, 2.5, 20);
        Jook jook = new Jook("coca", 0.6, 1.4);
        Joogipudel joogipudel = new Joogipudel(2, "Klaas", 10.0, 0.3);
        joogipudel.jook = jook;
        joogikast.joogipudel = joogipudel;
        Joogivaat joogivaat = new Joogivaat(312, 99999);
        int kogus = joogikast.villiKastiPudelid(joogivaat);
        assertEquals(20, kogus, 0.2);
    }



}
