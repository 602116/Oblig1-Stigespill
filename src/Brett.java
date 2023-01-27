import java.util.ArrayList;

public class Brett {

    private ArrayList<Rute> brett;


    public Brett(int antallRuter) {
        brett =  new RuteFactory(antallRuter).getRuter();
    }

    public Rute getStartPosisjon() {
        return brett.get(0);
    }

    public Rute finnRute(Rute rute, int sum){
        int index = rute.getIndex()+sum;

        if(index < 100){
            return brett.get(index).landetPaa();
        }

        return rute;

    }


}

