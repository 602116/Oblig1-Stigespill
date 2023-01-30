import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class BrikkeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void flyttBrikke() {
    }

    @Test
    void indexBrikke() {
        Brett brett = new Brett(100);
        MockRute rute = new MockRute(2);
        Brikke brikke = new Brikke(rute,brett);
        Assert.assertEquals(2,brikke);
    }

}