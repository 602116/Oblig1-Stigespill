abstract class Rute {

    private int index;

    public Rute(int index) {
        this.index = index;
    }

    /**
     *
     * @return - returnerer index til ruten
     */
    public int getIndex() {
        return index;
    }

    /**
     *
     * @return - returnerer ruten som skal bli landet på
     */
    abstract Rute landetPaa();
}
