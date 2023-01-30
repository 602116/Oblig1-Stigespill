import java.util.ArrayList;

public class Brett {

    private ArrayList<Rute> brett;


    public Brett(int antallRuter) {
        brett =  new RuteFactory(antallRuter).getRuter();
    }

    /**
     *
     * @return - returnerer første rute paa brettet
     */
    public Rute getStartPosisjon() {
        return brett.get(0);
    }

    /**
     * Finner rute etter terning er kastet, og sjekker om man går over siste rute på brettet
     * @param rute - rute brikken står på
     * @param sum - summen på terningen
     * @return - retunerer ny rute
     */
    public Rute finnRute(Rute rute, int sum){
        int index = rute.getIndex()+sum;

        if(index < 100){
            return brett.get(index).landetPaa();
        }

        return rute;

    }


}

