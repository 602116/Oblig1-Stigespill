import java.util.ArrayList;

public class Stigespill {

    private ArrayList<Spiller> spillere;
    private int antallSpillere;
    private final int antallRuter = 100;
    private boolean flag = false;

    public Stigespill(){
        spillere = new ArrayList<>();
        setup();
    }

    private void setup(){
        System.out.println("Starter spillet! I dette spillet har vi med " + antallSpillere + " spillere.");
        Brett brett = new Brett(antallRuter);
        for (int i = 0; i < antallSpillere; i++) {
            spillere.add(new Spiller("Spiller " + (i + 1),brett));
        }
    }
    public void start(){
        int runde = 1;
        while(!flag){
            System.out.println("Starter runde nummer: " + runde);
            spillRunde();
            runde++;
        }
    }

    public void spillRunde(){

        for(int i = 0; !flag && i < spillere.size(); i++){
            Spiller player = spillere.get(i);

            System.out.println(player.getNavn() + " spiller sin tur");
            player.spillTur();
            harVunnet(player.indexBrikke());
                if (flag){
                    System.out.println(player.getNavn() + " vant spillet! Gratulerer");
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
