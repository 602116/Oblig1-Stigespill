import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BrettTest {

    private Brett brett;

    @BeforeEach
    void setUp() {
        brett = new Brett(100);
    }

    @Test
    void getStartPosisjon() {

        assertEquals(0,brett.getStartPosisjon().getIndex());
    }

    @Test
    void finnRute() {
        assertEquals(3, brett.finnRute(brett.getStartPosisjon(), 3).getIndex());
    }
}