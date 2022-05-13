import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToiduainedTest {

    @Test
    public void lisaToiduaine(){
        Toiduaine toiduaine = new Toiduaine("Kartul", 1, 30, 60);
        Toidukomponent toidukomponent = new Toidukomponent(100, toiduaine);
        int kogus = toidukomponent.rasvakogus();
        assertEquals(1, kogus);
    }

    @Test
    public void toiduaoneLisamine(){
        ToiduainedList toiduainedList = new ToiduainedList();
        Toiduaine toiduaine = new Toiduaine("Kartul", 1, 30, 60);

        String vastus = toiduainedList.lisaToiduaine(toiduaine);

        assertEquals("Toiduaine edukalt lisatud", vastus);
    }

    @Test
    public void toiduaoneOtsimine(){
        ToiduainedList toiduainedList = new ToiduainedList();
        Toiduaine toiduaine = new Toiduaine("Kartul", 1, 30, 60);
        toiduainedList.lisaToiduaine(toiduaine);

        String vastus = toiduainedList.vaataAndmeid(toiduaine);

        assertEquals("Valgud: 30 Rasvad: 1 Süsivesikud: 60", vastus);
    }

    @Test
    public void toiduaoneKustutamine(){
        ToiduainedList toiduainedList = new ToiduainedList();
        Toiduaine toiduaine = new Toiduaine("Kartul", 1, 30, 60);
        toiduainedList.lisaToiduaine(toiduaine);
        String vastus = toiduainedList.kustutaToiduaine(toiduaine);
        assertEquals("Toiduaine kustutatud", vastus);
    }
}
