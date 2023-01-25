import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Stigespill {

    private ArrayList<Spiller> spillere;
    private int antallSpillere;
    private final int antallRuter = 100;
    private boolean flag = false;

    public Stigespill(int antallSpillere){
        spillere = new ArrayList<>();
        this.antallSpillere = antallSpillere;
        setup();
        System.out.println();
    }

    private void setup(){

        Brett brett = new Brett(antallRuter);
        for (int i = 0; i < antallSpillere; i++) {
            spillere.add(new Spiller("Spiller " + (i + 1),brett));
        }
    }
    public void start(){
        while(!flag){
            spillRunde();
        }
    }

    public void spillRunde(){

        for(int i = 0; !flag && i < spillere.size(); i++){
            spillere.get(i).spillTur();
            harVunnet(spillere.get(i).indexBrikke());
                if (flag){
                    System.out.println(spillere.get(i).getNavn());
                }
//            try{
//                sleep(1000);
//
//            }catch(InterruptedException e){
//
//            }
        }
    }

    private void harVunnet(int index){
        if(index == 99){
            this.flag = true;
        }
    }

}
