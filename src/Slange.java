public class Slange extends Rute{

    private Rute hale;

    public Slange(int index, Rute hale) {
        super(index);
        this.hale = hale;


    }

    @Override
    Rute landetPaa() {
      return hale;
    }
}
