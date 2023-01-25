public class Stige extends Rute{
    Rute topp;
    public Stige(int index, Rute topp) {
        super(index);
        this.topp = topp;
    }

    @Override
    Rute landetPaa() {
        return topp;
    }
}
