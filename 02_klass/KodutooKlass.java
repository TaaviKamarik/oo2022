public class KodutooKlass {

    String nimi;
    int elud;
    int kiirus;

    public KodutooKlass(String nimi, int elud, int kiirus) {
        this.nimi = nimi;
        this.elud = elud;
        this.kiirus = kiirus;
    }

    public void vahendaElusid(int number){
        this.elud -= number;
        System.out.println("Elusid on nüüd " + elud);
    }

    @Override
    public String toString() {
        return "Tegelase nimi on " + nimi + " | " +
                "Elusid on " + elud + " | " +
                "Kiirus on " + kiirus
                ;
    }
}
