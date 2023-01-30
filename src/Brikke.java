public class Brikke {


  private Rute rute;
  private Brett brett;


  public Brikke(Rute rute, Brett brett) {
    this.brett = brett;
    this.rute = rute;
  }


  /**
   *
   * @param sum - Antall ruter brikken skal flytte
   */
  public void flyttBrikke(int sum){
    rute = brett.finnRute(rute, sum);
  }

  /**
   *
   * @return - index til brikken
   */
  public int indexBrikke(){
    return rute.getIndex();
  }


}
