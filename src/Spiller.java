public class Spiller {

    private String navn;
    private Brikke brikke;

    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brikke = new Brikke(brett.getStartPosisjon(), brett);

    }

    public String getNavn() {
        return navn;
    }

    public void spillTur(){

        int verdi = trillTerning();
        brikke.flyttBrikke(verdi);


    }
    public int trillTerning() {
        int sum = Terning.trill();
        return sum;
    }
    public int indexBrikke(){
        return brikke.indexBrikke();
    }

}
