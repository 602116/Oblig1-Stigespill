import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TerningTest {

    @Test
    void trill() {
        double sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += Terning.trill();
        }
        sum = sum/1000000.0;
        System.out.println(sum);
        assertTrue((sum < 3.6 && sum > 3.4));

    }
}