import java.util.ArrayList;

public class RuteFactory {
    private ArrayList<Rute> ruter;
    private int antallRuter;
    public RuteFactory(int antallRuter) {
        ruter = new ArrayList<>();
        this.antallRuter = antallRuter;
        set();
    }

    public ArrayList<Rute> getRuter() {
        return this.ruter;
    }

    private void set() {
        for (int i = 0; i < antallRuter; i++) {
            ruter.add(i, new VanligRute(i));
        }
        this.setSlange();
        this.setStige();

    }

    private void setSlange() {
        System.out.println(ruter);
        Rute slange1 = new Slange(10, ruter.get(5));
        Rute slange2 = new Slange(30, ruter.get(10));
        Rute slange3 = new Slange(65, ruter.get(50));
        Rute slange4 = new Slange(98, ruter.get(0));

        ruter.set(slange1.getIndex(), slange1);
        ruter.set(slange2.getIndex(), slange2);
        ruter.set(slange3.getIndex(), slange3);
        ruter.set(slange4.getIndex(), slange4);


    }

    private void setStige() {
        Rute stige1 = new Stige(2, ruter.get(97));
        Rute stige2 = new Stige(12, ruter.get(52));
        Rute stige3 = new Stige(49, ruter.get(68));
        Rute stige4 = new Stige(72, ruter.get(83));

        ruter.set(stige1.getIndex(), stige1);
        ruter.set(stige2.getIndex(), stige2);
        ruter.set(stige3.getIndex(), stige3);
        ruter.set(stige4.getIndex(), stige4);

    }
}
