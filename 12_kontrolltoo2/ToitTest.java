import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToitTest {

    @Test
    public void retseptikontroll(){
        Toiduaine toiduaine = new Toiduaine("Kartul", 1, 30, 60);
        Toiduaine toiduaine2 = new Toiduaine("Hapukoor", 30, 20, 40);
        Toiduaine toiduaine3 = new Toiduaine("Porgand", 1, 10, 40);
        Toidukomponent toidukomponent1 = new Toidukomponent(10, toiduaine);
        Toidukomponent toidukomponent2 = new Toidukomponent(10, toiduaine2);
        Toidukomponent toidukomponent3 = new Toidukomponent(10, toiduaine3);
        Toit toit = new Toit("Kartulisalat");
        toit.lisaToidukomponent(toidukomponent1);
        toit.lisaToidukomponent(toidukomponent2);
        toit.lisaToidukomponent(toidukomponent3);
        String vastus = toit.toiduInfo();
        assertEquals("Valgud: 6 Rasvad: 3 Süsivesikud: 14", vastus);
    }
}
