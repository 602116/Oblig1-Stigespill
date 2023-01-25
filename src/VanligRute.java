public class VanligRute extends Rute {


    public VanligRute(int index) {
        super(index);
    }

    @Override
    Rute landetPaa() {
        return this;
    }
}
