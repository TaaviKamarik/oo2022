public class KodutooKlass {

    String nimi;
    int elud;

    public KodutooKlass(String nimi, int elud) {
        this.nimi = nimi;
        this.elud = elud;

    }

    public void vahendaElusid(int number){
        this.elud -= number;
        System.out.println("Elusid on nüüd " + elud);
    }

    @Override
    public String toString() {
        return "Tegelase nimi on " + nimi + " | " +
                "Elusid on " + elud
                ;
    }
}
