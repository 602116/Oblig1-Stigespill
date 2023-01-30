import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SpillerTest {
    private Spiller testSpiller1;
    private Spiller testSpiller2;
    private Spiller testSpiller3;
    private Spiller testSpiller4;

    @BeforeEach
    void setUp() {
        Brett testBrett = new Brett(100);
        testSpiller1 = new Spiller("TestSpiller 1",testBrett);
        testSpiller2 = new Spiller("TestSpiller 2",testBrett);
        testSpiller3 = new Spiller("TestSpiller 3",testBrett);
        testSpiller4 = new Spiller("TestSpiller 4",testBrett);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNavn() {
    }

    @Test
    void spillTur() {
        testSpiller1.spillTur();
        testSpiller2.spillTur();
        testSpiller3.spillTur();
        testSpiller4.spillTur();
    }

    @Test
    void trillTerning() {

    }

    @Test
    void indexBrikke() {
    }
}