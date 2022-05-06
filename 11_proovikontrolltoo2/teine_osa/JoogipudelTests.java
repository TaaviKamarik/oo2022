package teine_osa;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoogipudelTests {
    @Test
    public void arvutaKoguMassKuiJookiPole(){
        Joogipudel joogipudel = new Joogipudel(12,"klaas",20.0,0.2);
        double mass = joogipudel.mass;
        assertEquals(20.0, mass,0.1);
    }

    @Test
    public void arvutaKoguMassKuiJookOn(){
        Joogipudel joogipudel = new Joogipudel(12,"klaas",20.0,0.2);
        Jook jook = new Jook("coca cola", 0.6, 1.4);
        joogipudel.jook = jook;
        double mass = joogipudel.getMass();
        assertEquals(21.4, mass,0.1);
    }

    @Test
    public void arvutaKoguHindKuiJookiPole(){
        Joogipudel joogipudel = new Joogipudel(12,"klaas",20.0,0.2);
        double hind = joogipudel.getKoguhind();
        assertEquals(0.2, hind,0.1);
    }

    @Test
    public void arvutaKoguhindMassKuiJookOn(){
        Joogipudel joogipudel = new Joogipudel(12,"klaas",20.0,0.2);
        Jook jook = new Jook("coca cola", 0.6, 1.4);
        joogipudel.jook = jook;
        double hind = joogipudel.getKoguhind();
        assertEquals(1.04, hind,0.1);
    }
}
