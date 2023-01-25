abstract class Rute {

    private int index;

    public Rute(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    abstract Rute landetPaa();
}
