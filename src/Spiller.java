public class Spiller {

    private String navn;
    private Brikke brikke;
    private int antall;
    private boolean flag;

    public Spiller(String navn) {
        this.navn = navn;
    }

    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brikke = new Brikke(brett.getStartPosisjon(), brett);

    }

    public String getNavn() {
        return navn;
    }

    public void spillTur() {


        int verdi = trillTerning();


        if (flag) {

            brikke.flyttBrikke(trilletSekserForaaKommeUt(verdi));

        } else {


            System.out.println("\t" + this.navn + " står på rute " + brikke.indexBrikke());
            System.out.println("\t" + this.navn + " trillet " + verdi);

            if (verdi == 6) {
                verdi = trilletSeks(verdi);
            }

            if (brikke.indexBrikke() + verdi > 99) {


                System.out.println("Kan ikke flytte pga for høy sum. Står på samme rute");
            } else {
                brikke.flyttBrikke(verdi);


                System.out.println("\t" + this.navn + " flytter " + verdi + " ruter");
                System.out.println("\t" + this.navn + " landet på rute " + brikke.indexBrikke());
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

                this.antall++;

                System.out.println("\t" + this.getNavn() + " får nytt kast");

                int nyttTrill = trillTerning();

                System.out.println("\t" + "Nytt trill " + nyttTrill);

                verdi += nyttTrill;


            }
        }
        trilletTreSekserePaaRad();
        antall = 0;
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
            return 6;
        }else return 0;
    }


    public int indexBrikke() {
        return brikke.indexBrikke();
    }

}
