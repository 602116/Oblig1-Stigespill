public class Brikke {


  private Rute rute;
  private Brett brett;

  public Brikke(){

  }
  public Brikke(Rute rute, Brett brett) {
    this.brett = brett;
    this.rute = rute;
  }



  public void flyttBrikke(int sum){
    rute = brett.finnRute(rute, sum);
  }

  public int indexBrikke(){
    return rute.getIndex();
  }


}
