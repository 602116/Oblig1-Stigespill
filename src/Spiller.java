public class Spiller {

    private String navn;
    private Brikke brikke;

    public Spiller(String navn){
        this.navn = navn;
    }

    public Spiller(String navn, Brett brett) {
        this.navn = navn;
        this.brikke = new Brikke(brett.getStartPosisjon(), brett);

    }

    public String getNavn() {
        return navn;
    }

    public void spillTur(){

        Spiller spiller = new Spiller(this.navn);

        int verdi = trillTerning();


        System.out.println("\t" + spiller.getNavn() + " står på rute " + brikke.indexBrikke());
        System.out.println("\t" + spiller.getNavn() + " trillet " + verdi);

       verdi += trilletSeks(verdi);

        if(brikke.indexBrikke() + verdi > 99){
            System.out.println("Kan ikke flytte pga for høy sum. Står på samme rute");
        } else{
            brikke.flyttBrikke(verdi);
            System.out.println("\t" + spiller.getNavn() + " flytter " + verdi + " ruter");
            System.out.println("\t" + spiller.getNavn() + " landet på rute " + brikke.indexBrikke());
        }




    }
    public int trillTerning() {
        int sum = Terning.trill();
        return sum;
    }

    private int trilletSeks(int sum){
        if(sum == 6){
            System.out.println("\t" + this.getNavn() + " får nytt kast");
            int nyttTrill = trillTerning();
            int verdi = 0;
            System.out.println("\t" + "Nytt trill " + nyttTrill);
            verdi = nyttTrill;


            return verdi;
        }
        return 0;
    }


    public int indexBrikke(){
        return brikke.indexBrikke();
    }

}
