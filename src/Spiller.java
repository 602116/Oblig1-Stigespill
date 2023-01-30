public class Spiller {

    private String navn;
    private Brikke brikke;
    private final int ANTALL_SEKSERE = 2;
    private int antallSeksere;
    private boolean flag;

    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brikke = new Brikke(brett.getStartPosisjon(), brett);

    }

    public String getNavn() {
        return navn;
    }

    /**
     * spiller turen til spilleren
     */
    public void spillTur() {


        int verdi = trillTerning();


        if (flag) {

            brikke.flyttBrikke(trilletSekserForaaKommeUt(verdi));

        } else {


            System.out.println("\t" + this.navn + " står på rute " + brikke.indexBrikke());
            System.out.println("\t" + this.navn + " trillet " + verdi);

            verdi = trilletSeks(verdi);

            flyttSjekk(verdi);

        }
    }


    }

    public int trillTerning() {
        int sum = Terning.trill();
        return sum;
    }

    private int trilletSeks(int sum) {

        int verdi = sum;

        while (verdi % 6 == 0 && antall <= 3) {

            if (sum == 6) {

                this.antallSeksere++;

                System.out.println("\t" + this.getNavn() + " får nytt kast");

                int nyttTrill = trillTerning();

                System.out.println("\t" + "Nytt trill " + nyttTrill);

                verdi += nyttTrill;


            }
        }
        trilletTreSekserePaaRad();
        antallSeksere = 0;
        return verdi;
    }

    private void trilletTreSekserePaaRad() {

        if (antall == 3) {
            System.out.println("Trillet tre seksere på rad, flytt tilbake til start");
            brikke.flyttTilbakeTilStart();
            this.flag = true;

        }

    }

    private int trilletSekserForaaKommeUt(int verdi){
        if (verdi==6){
            this.flag = false;
            return verdi;
        } else return 0;
    }


    public int indexBrikke() {
        return brikke.indexBrikke();
    }

}
