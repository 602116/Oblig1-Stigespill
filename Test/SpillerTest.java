import org.testng.Assert;
import org.testng.annotations.Test;

public class SpillerTest {

    @Test
    public void testBrikke(){
        Brett brett = new Brett(100);
        MockRute rute = new MockRute(2);
        Brikke brikke = new Brikke(rute,brett);
        int plass = brikke.indexBrikke();
        Assert.assertEquals(2,plass);
        Assert.assertEquals(2,plass);

    }

}
